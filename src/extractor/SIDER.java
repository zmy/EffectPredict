package extractor;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseInt;
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

	public static class MappingInfo {
		public String[] genericNames;
		public String[] brandNames;
		public String marker;
		public Integer flatCompound;
		public Integer stereoCompound;
		public String urlPDF;
		public String label;

		public void setGenericNames(String genericNames) {
			this.genericNames = genericNames.split(";");
		}

		public void setBrandNames(String brandNames) {
			this.brandNames = brandNames.split(";");
		}

		public void setMarker(String marker) {
			this.marker = marker;
		}

		public void setFlatCompound(Integer flatCompound) {
			this.flatCompound = flatCompound;
		}

		public void setStereoCompound(Integer stereoCompound) {
			this.stereoCompound = stereoCompound;
		}

		public void setUrlPDF(String urlPDF) {
			this.urlPDF = urlPDF;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		/*public MappingInfo(final String genericNames, final String brandNames, final String marker,
				final Integer flatCompound, final Integer stereoCompound, final String urlPDF,
				final String label) {
		}*/

		public MappingInfo() {}
	}

	public static class SIDEInfo {
		public String label;
		public String concept;
		public String sideName;

		public void setLabel(String label) {
			this.label = label;
		}

		public void setConcept(String concept) {
			this.concept = concept;
		}

		public void setSideName(String sideName) {
			this.sideName = sideName;
		}

		/*public SIDEInfo(final String label, final String concept, final String sideName) {
			this.label = label;
			this.concept = concept;
			this.sideName = sideName;
		}*/

		public SIDEInfo() {}
	}

	ArrayList<MappingInfo> mappings;
	ArrayList<SIDEInfo> sides;

	CellProcessor[] getMappingProcessors() {
		final CellProcessor[] processors = new CellProcessor[] {
				//1 & 2: generic and brand names
				new Optional(),
				new Optional(),
				//3: a marker if the drug could be successfully mapped to STITCH. Possible values:
				// - [empty field]: success
				// - combination: two or more drugs were combined
				// - not found: could not find the name in the database
				// - mapping conflict: the available names point to two different compounds
				// - template: a package insert that contains information for a group of related drugs
				new Optional(),
				//4 & 5: STITCH compound ids, based on PubChem. Salt forms and stereo-isomers have been merged.
				//   Column 4: "flat compound", i.e. stereo-isomers have been merged into one compound
				//	 Column 5: stereo-specific compound id
				//	
				//	 To get the PubChem Compound Ids: take absolute value, for flat compounds ids: subtract 100000000
				//	 E.g. aspirin: -100002244 --> 2244
				new Optional(new ParseInt()),
				new Optional(new ParseInt()),
				//6: URL of the downloaded PDF. This column is empty for FDA SPL labels, which are available in XML.
				//	 Unfortunately, many links have become stale since the labels were downloaded in 2009. 
				new Optional(),
				//7: label identifier
				new NotNull()
		};
		return processors;
	}

	CellProcessor[] getSIDEProcessors() {
		final CellProcessor[] processors = new CellProcessor[] {
				//label identifier
				new NotNull(),
				//concept id
				new NotNull(),
				//name of side effect (as found on the label)
				new NotNull()
		};
		return processors;
	}

	public SIDER(String database) throws IOException {
		/* read mapping info */
		String[] mappingHeader = {"genericNames", "brandNames", "marker", "flatCompound", "stereoCompound", "urlPDF", "label"};
		CsvBeanReader reader = new CsvBeanReader(new FileReader(database+MAPPING_FILE), CsvPreference.TAB_PREFERENCE);
		CellProcessor[] processors = getMappingProcessors();
		MappingInfo mapping;
		mappings = new ArrayList<MappingInfo>();
		while ((mapping = reader.read(MappingInfo.class, mappingHeader, processors)) != null)
			mappings.add(mapping);
		reader.close();

		HashSet<Integer> compoundIDs1 = new HashSet<Integer>();
		HashSet<Integer> compoundIDs2 = new HashSet<Integer>();
		for (MappingInfo info: mappings) {
			compoundIDs1.add(info.flatCompound);
			compoundIDs2.add(info.stereoCompound);
		}
		System.out.println("SIDER containts "+compoundIDs1.size()+" flatCs and "+compoundIDs2.size()+" stereos.");

		/* read side effect info */
		String[] SIDEHeader = {"label", "concept", "sideName"};
		reader = new CsvBeanReader(new FileReader(database+ADEFFECTS_FILE), CsvPreference.TAB_PREFERENCE);
		processors = getSIDEProcessors();
		SIDEInfo side;
		sides = new ArrayList<SIDEInfo>();
		while ((side = reader.read(SIDEInfo.class, SIDEHeader, processors)) != null)
			sides.add(side);
		reader.close();

		HashSet<String> drugLabels = new HashSet<String>();
		HashSet<String> sideConcepts = new HashSet<String>();
		for (SIDEInfo info: sides) {
			drugLabels.add(info.label);
			sideConcepts.add(info.concept);
		}
		System.out.println("SIDER containts "+drugLabels.size()+" drugs and "+sideConcepts.size()+" sides.");
	}
}
