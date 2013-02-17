package exp.preprocessing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.xml.bind.JAXBException;

import exp.*;
import extractor.DrugBank;
import extractor.KEGG;
import extractor.SIDER;

/**
 * 
 * @author zmy
 *
 */
public class Raw2Local {

	static final String DRUGBANK_DIR = "data/DrugBank/";
	static final String SIDER_DIR = "data/SIDER/";
	static final String FEATURE_FILE = "feature.txt";

	static class UnifiedDrug {
		int drugbankIdx;
		String siderDrugName;

		public int getDrugBank() {
			return drugbankIdx;
		}

		public String getSIDER() {
			return siderDrugName;
		}

		public UnifiedDrug(int drugbankIdx, String siderDrugName) {
			this.drugbankIdx = drugbankIdx;
			this.siderDrugName = siderDrugName;
		}
	}

	/**
	 * Try to match drugs from different databases.
	 * @param drugbank
	 * @param sider
	 */
	static void matchDrugs(DrugBank drugbank, SIDER sider, ArrayList<UnifiedDrug> uniDrugs) {
		String last = null;
		int failed = 0;
		for (SIDER.MedSIDEInfo info: sider.getMeddraSIDEInfos()) 
			if (!info.drugName.equals(last)) {
				int idx0 = drugbank.searchName(info.drugName);
				HashSet<Integer> idx1 = drugbank.searchSynonyms(info.drugName);
				HashSet<Integer> idx2 = drugbank.searchPubChem(-info.stereoCompoundID);
				System.out.println(info.drugName+" matched to "+idx0+" "+idx1+" "+idx2);
				last = info.drugName;
				if (idx1==null && idx2==null)
					if (idx0 == -1)
						failed++;
					else uniDrugs.add(new UnifiedDrug(idx0, info.drugName));
				else {
					HashSet<Integer> result;
					if (idx1 == null) result = idx2;
					else
						if (idx2 == null) result = idx1;
						else {
							result = new HashSet<Integer>(idx1);
							result.retainAll(idx2);
						}
					if (idx0 == -1)
						if (result.size() > 1) {
							System.out.println("Multiple Matches!");
							failed++;
						}
						else
							for (Integer idx: result) // there should be only one idx
								uniDrugs.add(new UnifiedDrug(idx, info.drugName));
					else
						if (!result.contains(idx0)) {
							System.out.println("Conflict Match!");
							failed++;
						}
						else uniDrugs.add(new UnifiedDrug(idx0, info.drugName));
				}

			}
		System.out.println(failed+" SIDER drugs failed to match.");
	}

	/**
	 * Create feature vector of each drug.
	 * @param drugbank
	 * @throws IOException 
	 */
	static void creatFeatures(DrugBank drugbank, SIDER sider, ArrayList<UnifiedDrug> uniDrugs) throws IOException {
		ArrayList<DrugFeature> features = new ArrayList<DrugFeature>();
		Indexer substructures = new Indexer();
		Indexer interactions = new Indexer();
		Indexer pathways = new Indexer();
		Indexer targets = new Indexer();
		Indexer enzymes = new Indexer();
		Indexer transporters  = new Indexer();
		Indexer carriers = new Indexer();
		Indexer siders = new Indexer();
		for (UnifiedDrug uniDrug: uniDrugs) {
			int idx = uniDrug.getDrugBank();
			String name = uniDrug.getSIDER();
			System.out.println(idx+"th drug in DrugBank and drug "+name+" in SIDER");
			DrugFeature feature = new DrugFeature();
			/* Substructures */
			feature.addFeature(drugbank.getSubStructures(idx), substructures);
			/* Interactions */
			feature.addFeature(drugbank.getInteractions(idx), interactions);
			/* Pathways */
			String KEGGD = drugbank.getKEGGDrug(idx);
			if (KEGGD != null)
				feature.addFeature(KEGG.Parser.extractPathways(KEGG.linkedEntries(KEGG.Database.PATHWAY, drugbank.getKEGGDrug(idx)))
						, pathways);
			else
				feature.addFeature(new ArrayList<String>(), pathways);
			/* Targets, Enzymes, Transporters, Carriers */
			feature.addFeature(drugbank.getTargetsPartners(idx), targets);
			feature.addFeature(drugbank.getEnzymesPartners(idx), enzymes);
			feature.addFeature(drugbank.getTransportersPartners(idx), transporters);
			feature.addFeature(drugbank.getCarriersPartners(idx), carriers);
			/* side effects */
			feature.addFeature(sider.getSIDE(name), siders);
			features.add(feature);
		}
		//TODO: check partners overlap? if so combine;
		/* print features as binary vectors to a file */
		System.out.println("Length of feature vector is "+features.get(0).length());
		System.out.println("Last "+siders.size()+" bits are SIDE info.");
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(FEATURE_FILE)));
		for (DrugFeature feature: features) {
			writer.write(feature.toString());
			writer.newLine();
		}
		writer.close();
	}

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws JAXBException, IOException {
		DrugBank drugbank = new DrugBank(DRUGBANK_DIR);
		SIDER sider = new SIDER(SIDER_DIR);

		ArrayList<UnifiedDrug> uniDrugs = new ArrayList<UnifiedDrug>();
		matchDrugs(drugbank, sider, uniDrugs);

		creatFeatures(drugbank, sider, uniDrugs);

		/* Following code is for experiments */
		//int idx = drugbank.searchName("Acebutolol"); //Levothyroxine
		//System.out.println(drugbank.getSubStructures(idx));
		//System.out.println(drugbank.getInteractions(idx));

		//System.out.println(drugbank.getKEGGD(idx));
		//System.out.println(KEGG.Parser.extractPathways(
		//		KEGG.linkedEntries(KEGG.Database.PATHWAY, drugbank.getKEGGD(idx))));

		/*
		for (TargetBondType tbt: drugbank.getTargets(idx)) {
			System.out.println();
			System.out.println(tbt.getPartner());
			//TODO: index this number
			//TODO: external .csv files
			//System.out.println(tbt.getPosition());
			//System.out.println(tbt.getKnownAction());
			//System.out.println(tbt.getReferences());
			System.out.println(tbt.getActions().getAction());
			//TODO: how to use actions?
		}
		 */
	}

}
