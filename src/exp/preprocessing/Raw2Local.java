package exp.preprocessing;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import exp.*;
import extractor.DrugBank;
import extractor.KEGG;
import extractor.ca.drugbank.BondType;
import extractor.ca.drugbank.TargetBondType;

/**
 * 
 * @author zmy
 *
 */
public class Raw2Local {

	static final String DRUGBANK = "data/DrugBank/";

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
		DrugBank drugbank = new DrugBank(DRUGBANK);
		System.out.println("DrugBank contains "+drugbank.size()+" drugs.");

		ArrayList<DrugFeature> features = new ArrayList<DrugFeature>();
		Indexer substructures = new Indexer();
		Indexer interactions = new Indexer();
		Indexer pathways = new Indexer();
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
			for (TargetBondType bt: drugbank.getTargets(idx)) {
				bt.getPartner();
				//TODO: index this number
				//TODO: external .csv files
				bt.getActions().getAction();
			}
			for (BondType bt: drugbank.getEnzymes(idx)) {
				bt.getPartner();
				//TODO: index this number
				//TODO: external .csv files
				bt.getActions().getAction();
			}
			for (BondType bt: drugbank.getTransporters(idx)) {
				bt.getPartner();
				//TODO: index this number
				//TODO: external .csv files
				bt.getActions().getAction();
			}
			for (BondType bt: drugbank.getCarriers(idx)) {
				bt.getPartner();
				//TODO: index this number
				//TODO: external .csv files
				bt.getActions().getAction();
			}
			//TODO: side effects

			features.add(feature);
		}

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
		}
	}

}
