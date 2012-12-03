package exp.preprocessing;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import exp.*;
import extractor.DrugBank;
import extractor.KEGG;
import extractor.ca.drugbank.TargetBondType;

/**
 * 
 * @author zmy
 *
 */
public class Raw2Local {

	static final String DRUGBANK_DIR = "data/DrugBank/";
	static final String SIDER_DIR = "data/SIDER/";

	static void matchDrugs() {
		;
	}

	/**
	 * 
	 * @param drugbank
	 * @throws IOException 
	 */
	static void creatFeatures(DrugBank drugbank) throws IOException {
		ArrayList<DrugFeature> features = new ArrayList<DrugFeature>();
		Indexer substructures = new Indexer();
		Indexer interactions = new Indexer();
		Indexer pathways = new Indexer();
		Indexer targets = new Indexer();
		Indexer enzymes = new Indexer();
		Indexer transporters  = new Indexer();
		Indexer carriers = new Indexer();
		for (int idx=0; idx<drugbank.size(); idx++) {
			DrugFeature feature = new DrugFeature();
			/* Substructures */
			feature.addFeature(drugbank.getSubStructures(idx), substructures);
			/* Interactions */
			feature.addFeature(drugbank.getInteractions(idx), interactions);
			/* Pathways */
			String KEGGD = drugbank.getKEGGD(idx);
			if (KEGGD != null)
				feature.addFeature(KEGG.Parser.extractPathways(KEGG.linkedEntries(KEGG.Database.PATHWAY, drugbank.getKEGGD(idx)))
						, pathways);
			else
				feature.addFeature(new ArrayList<String>(), pathways);
			/* Targets, Enzymes, Transporters, Carriers */
			feature.addFeature(drugbank.getTargetsPartners(idx), targets);
			feature.addFeature(drugbank.getEnzymesPartners(idx), enzymes);
			feature.addFeature(drugbank.getTransportersPartners(idx), transporters);
			feature.addFeature(drugbank.getCarriersPartners(idx), carriers);
			//TODO: side effects

			features.add(feature);
		}
		//TODO: check partners overlap? if so combine;
	}

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws JAXBException, IOException {
		DrugBank drugbank = new DrugBank(DRUGBANK_DIR);
		System.out.println("DrugBank contains "+drugbank.size()+" drugs.");

		matchDrugs();
		creatFeatures(drugbank);

		int idx = drugbank.searchName("Acebutolol"); //Levothyroxine
		//System.out.println(drugbank.getSubStructures(idx));
		//System.out.println(drugbank.getInteractions(idx));

		//System.out.println(drugbank.getKEGGD(idx));
		//System.out.println(KEGG.Parser.extractPathways(
		//		KEGG.linkedEntries(KEGG.Database.PATHWAY, drugbank.getKEGGD(idx))));

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
	}

}
