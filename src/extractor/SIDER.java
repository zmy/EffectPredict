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
	static final String RAW_ADEFFECTS_FILE = "adverse_effects_raw.tsv";
	static final String RAW_INDICATIONS_FILE = "indications_raw.tsv";
	static final String MED_ADEFFECTS_FILE = "meddra_adverse_effects.tsv";
	static final String MED_FREQ_FILE = "meddra_freq_parsed.tsv";

	public static class MappingInfo {
		public String[] genericNames;
		public String[] brandNames;
		public String marker;
		public Integer flatCompoundID;
		public Integer stereoCompoundID;
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

		public void setFlatCompoundID(Integer flatCompoundID) {
			this.flatCompoundID = flatCompoundID;
		}

		public void setStereoCompoundID(Integer stereoCompoundID) {
			this.stereoCompoundID = stereoCompoundID;
		}

		public void setUrlPDF(String urlPDF) {
			this.urlPDF = urlPDF;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public MappingInfo() {}
	}

	public static class RawSIDEInfo {
		public String label;
		public String conceptID;
		public String sideName;

		public void setLabel(String label) {
			this.label = label;
		}

		public void setConceptID(String conceptID) {
			this.conceptID = conceptID;
		}

		public void setSideName(String sideName) {
			this.sideName = sideName;
		}

		public RawSIDEInfo() {}
	}

	public static class MedSIDEInfo {
		public Integer flatCompoundID;
		public Integer stereoCompoundID;
		public String conceptID;
		public String drugName;
		public String sideName;
		public String medConceptType;
		public String medConceptID;
		public String medSideName;

		public void setFlatCompoundID(Integer flatCompoundID) {
			this.flatCompoundID = flatCompoundID;
		}

		public void setStereoCompoundID(Integer stereoCompoundID) {
			this.stereoCompoundID = stereoCompoundID;
		}

		public void setConceptID(String conceptID) {
			this.conceptID = conceptID;
		}
		public void setDrugName(String drugName) {
			this.drugName = drugName;
		}

		public void setSideName(String sideName) {
			this.sideName = sideName;
		}

		public void setMedConceptType(String medConceptType) {
			this.medConceptType = medConceptType;
		}

		public void setMedConceptID(String medConceptID) {
			this.medConceptID = medConceptID;
		}

		public void setMedSideName(String medSideName) {
			this.medSideName = medSideName;
		}

		public MedSIDEInfo() {}
	}

	ArrayList<MappingInfo> mappings;
	ArrayList<RawSIDEInfo> rawSides;
	ArrayList<MedSIDEInfo> medSides;

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

	CellProcessor[] getRawSIDEProcessors() {
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

	CellProcessor[] getMedSIDEProcessors() {
		final CellProcessor[] processors = new CellProcessor[] {
				//1 & 2: STITCH compound ids (flat/stereo, see above)
				new ParseInt(),
				new ParseInt(),
				//3: UMLS concept id as it was found on the label
				new NotNull(),
				//4: drug name
				new NotNull(),
				//5: side effect name
				new NotNull(),
				//6: MedDRA concept type (LLT = lowest level term, PT = preferred term)
				new NotNull(),
				//7: UMLS concept id for MedDRA term
				new NotNull(),
				//8: MedDRA side effect	name
				new NotNull()
		};
		return processors;
	}

	public SIDER(String database) throws IOException {
		/* read mapping info */
		String[] mappingHeader = {"genericNames", "brandNames", "marker", "flatCompoundID", "stereoCompoundID", "urlPDF", "label"};
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
			compoundIDs1.add(info.flatCompoundID);
			compoundIDs2.add(info.stereoCompoundID);
		}
		System.out.println("SIDER mapping contains "+compoundIDs1.size()+" flatCs and "+compoundIDs2.size()+" stereos.");

		/* read raw side effect info */
		String[] rawSIDEHeader = {"label", "conceptID", "sideName"};
		reader = new CsvBeanReader(new FileReader(database+RAW_ADEFFECTS_FILE), CsvPreference.TAB_PREFERENCE);
		processors = getRawSIDEProcessors();
		RawSIDEInfo rawSide;
		rawSides = new ArrayList<RawSIDEInfo>();
		while ((rawSide = reader.read(RawSIDEInfo.class, rawSIDEHeader, processors)) != null)
			rawSides.add(rawSide);
		reader.close();

		HashSet<String> drugLabels = new HashSet<String>();
		HashSet<String> sideConcepts = new HashSet<String>();
		for (RawSIDEInfo info: rawSides) {
			drugLabels.add(info.label);
			sideConcepts.add(info.conceptID);
		}
		System.out.println("SIDER raw contains "+drugLabels.size()+" drugs and "+sideConcepts.size()+" sides.");

		/* read meddra side effect info */
		String[] medSIDEHeader = {"flatCompoundID", "stereoCompoundID", "conceptID", "drugName", "sideName", "medConceptType", "medConceptID", "medSideName"};
		reader = new CsvBeanReader(new FileReader(database+MED_ADEFFECTS_FILE), CsvPreference.TAB_PREFERENCE);
		processors = getMedSIDEProcessors();
		MedSIDEInfo medSide;
		medSides = new ArrayList<MedSIDEInfo>();
		while ((medSide = reader.read(MedSIDEInfo.class, medSIDEHeader, processors)) != null)
			medSides.add(medSide);
		reader.close();

		HashSet<String> drugNames = new HashSet<String>();
		for (MedSIDEInfo info: medSides) {
			drugNames.add(info.drugName);
		}
		System.out.println("SIDER med contains "+medSides.size()+" entries, and "+drugNames.size()+" drug names.");
	}
}
