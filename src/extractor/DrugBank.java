package extractor;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.*;

import extractor.ca.drugbank.*;
import extractor.ca.drugbank.IdentifiersType.ExternalIdentifier;


/**
 * Extracts data from <a href="http://www.drugbank.ca/">DrugBank</a>.
 * @author zmy
 *
 */
public class DrugBank {

	Drugs drugs;
	List<DrugType> drugList;

	HashMap<String, Integer> name2idx;
	HashMap<String, Integer> id2idx;

	/**
	 * 
	 * @return the number of drugs in DrugBank database
	 */
	public int size() {
		return drugList.size();
	}

	/**
	 * 
	 * @param idx the index
	 * @return the drug name
	 */
	public String getName(int idx) {
		return drugList.get(idx).getName();
	}
	
	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<String> getBrands(int idx) {
		return drugList.get(idx).getBrands().getBrand();
	}

	/**
	 * 
	 * @param name the drug name
	 * @return corresponding index
	 */
	public int searchName(String name) {
		return name2idx.get(name);
	}

	/**
	 * 
	 * @param idx the index
	 * @return drug IDs and Accession Numbers
	 */
	public List<String> getIDs(int idx) {
		DrugType drug = drugList.get(idx);
		ArrayList<String> ids = new ArrayList<String>();
		ids.add(drug.getDrugbankId());
		ids.addAll(drug.getSecondaryAccessionNumbers().getSecondaryAccessionNumber());
		return ids;
	}

	/**
	 * 
	 * @param name the drug ID
	 * @return corresponding index
	 */
	public int searchID(String id) {
		return id2idx.get(id);
	}

	/**
	 * 
	 * @param idx
	 * @return the type of drug
	 */
	public String getType(int idx) {
		return drugList.get(idx).getType();
	}

	/**
	 * 
	 * @param idx
	 * @return which groups the drug belongs to
	 */
	public List<String> getGroups(int idx) {
		return drugList.get(idx).getGroups().getGroup();
	}

	/**
	 * 
	 * @param idx
	 * @return the Substructures (in Taxonomy) of the drug
	 */
	public List<String> getSubStructures(int idx) {
		ArrayList<String> subs = new ArrayList<String>();
		for (Substructure sub: drugList.get(idx).getTaxonomy().getSubstructures().getSubstructure())
			subs.add(sub.getClazz()+"\t"+sub.getValue());
		//TODO: is clazz info useful? true, false, unknown
		return subs;
	}

	/**
	 * 
	 * @param idx
	 * @return Drug Interactions
	 */
	public List<String> getInteractions(int idx) {
		ArrayList<String> inters = new ArrayList<String>();
		for (DrugInteraction inter: drugList.get(idx).getDrugInteractions().getDrugInteraction())
			inters.add(inter.getDrug()/*+"\t"+inter.getName()*/);
		return inters;
	}

	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<TargetBondType> getTargets(int idx) {
		return drugList.get(idx).getTargets().getTarget();
	}

	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<BondType> getTRansporters(int idx) {
		return drugList.get(idx).getTransporters().getTransporter();
	}

	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<BondType> getEnzymes(int idx) {
		return drugList.get(idx).getEnzymes().getEnzyme();
	}

	/**
	 * 
	 * @param idx
	 * @return KEGG Number from External Identifiers
	 */
	public String getKEGGD(int idx) {
		for (ExternalIdentifier eid: drugList.get(idx).getExternalIdentifiers().getExternalIdentifier()) {
			//System.out.println(eid.getResource()+"\t"+eid.getIdentifier());
			if (eid.getResource().equalsIgnoreCase("KEGG Drug"))
				return eid.getIdentifier();
		}
		return null;
	}

	/**
	 * 
	 * @param database the directory of the drugbank database
	 * @throws JAXBException
	 */
	public DrugBank(String database) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Drugs.class);
		Unmarshaller um = context.createUnmarshaller();
		drugs = (Drugs) um.unmarshal(new File(database+"drugbank.xml"));
		drugList = drugs.getDrug();

		name2idx = new HashMap<String, Integer>();
		id2idx = new HashMap<String, Integer>();
		for (int i=0; i<size(); i++) {
			name2idx.put(getName(i), i);
			for (String id: getIDs(i))
				id2idx.put(id, i);
		}
	}
}
