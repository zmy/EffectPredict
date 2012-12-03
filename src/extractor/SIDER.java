package extractor;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseBigDecimal;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

/**
 * Extracts data from <a href="http://sideeffects.embl.de/">SIDER</a>.
 * @author zmy
 *
 */
public class SIDER {
	static final String MAPPING_FILE = "label_mapping.tsv"; //Original file is wrong at line 30574: the first tab
	static final String ADEFFECTS_FILE = "adverse_effects_raw.tsv";
	static final String INDICATIONS_FILE = "indications_raw.tsv";

	public class MappingInfo {
		public String[] genericNames;
		public String[] brandNames;
		public String marker;
		public BigDecimal flatCompound;
		public BigDecimal stereoCompound;
		public String urlPDF;
		public String label;

		public MappingInfo(final String genericNames, final String brandNames, final String marker,
				final BigDecimal flatCompound, final BigDecimal stereoCompound, final String urlPDF,
				final String label) {
			this.genericNames = genericNames.split(";");
			this.brandNames = brandNames.split(";");
			this.marker = marker;
			this.flatCompound = flatCompound;
			this.stereoCompound = stereoCompound;
			this.urlPDF = urlPDF;
			this.label = label;
		}
	}

	ArrayList<MappingInfo> mappings;

	CellProcessor[] getMappingProcessors() {
		final CellProcessor[] processors = new CellProcessor[] {
				//1 & 2: generic and brand names
				new NotNull(), // can be empty
				new NotNull(),
				//3: a marker if the drug could be successfully mapped to STITCH. Possible values:
				// - [empty field]: success
				// - combination: two or more drugs were combined
				// - not found: could not find the name in the database
				// - mapping conflict: the available names point to two different compounds
				// - template: a package insert that contains information for a group of related drugs
				new NotNull(),
				//4 & 5: STITCH compound ids, based on PubChem. Salt forms and stereo-isomers have been merged.
				//   Column 4: "flat compound", i.e. stereo-isomers have been merged into one compound
				//	 Column 5: stereo-specific compound id
				//	
				//	 To get the PubChem Compound Ids: take absolute value, for flat compounds ids: subtract 100000000
				//	 E.g. aspirin: -100002244 --> 2244
				new Optional(new ParseBigDecimal()),
				new Optional(new ParseBigDecimal()),
				//6: URL of the downloaded PDF. This column is empty for FDA SPL labels, which are available in XML.
				//	 Unfortunately, many links have become stale since the labels were downloaded in 2009. 
				new Optional(),
				//7: label identifier
				new NotNull()
		};
		return processors;
	}

	public SIDER(String database) throws IOException {
		CsvBeanReader reader = new CsvBeanReader(new FileReader(database+MAPPING_FILE), CsvPreference.TAB_PREFERENCE);
		String[] header = reader.getHeader(true);
		CellProcessor[] processors = getMappingProcessors();
		MappingInfo mapping;
		mappings = new ArrayList<MappingInfo>();
		while ((mapping = reader.read(MappingInfo.class, header, processors)) != null)
			mappings.add(mapping);
		reader.close();
	}
}
