package extractor;

import java.io.File;
import java.math.BigInteger;
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

	static final String DATAFILE = "drugbank.xml";

	Drugs drugs;
	List<DrugType> drugList;

	HashMap<String, Integer> name2idx;
	HashMap<String, Integer> synonyms2idx;
	HashMap<Integer, Integer> pubChemCom2idx;
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
	public List<String> getSynonyms(int idx) {
		return drugList.get(idx).getSynonyms().getSynonym();
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
	 * @param idx the index
	 * @return drugbank IDs and Accession Numbers
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
			subs.add(/*sub.getClazz()+"\t"+*/sub.getValue());
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
	public List<BigInteger> getTargetsPartners(int idx) {
		ArrayList<BigInteger> targetPartner = new ArrayList<BigInteger>();
		for (TargetBondType bt: getTargets(idx))
			targetPartner.add(bt.getPartner());
		return targetPartner;
	}

	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<BondType> getTransporters(int idx) {
		return drugList.get(idx).getTransporters().getTransporter();
	}

	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<BigInteger> getTransportersPartners(int idx) {
		ArrayList<BigInteger> transporterPartner = new ArrayList<BigInteger>();
		for (BondType bt: getTransporters(idx))
			transporterPartner.add(bt.getPartner());
		return transporterPartner;
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
	 * @return
	 */
	public List<BigInteger> getEnzymesPartners(int idx) {
		ArrayList<BigInteger> enzymePartner = new ArrayList<BigInteger>();
		for (BondType bt: getEnzymes(idx))
			enzymePartner.add(bt.getPartner());
		return enzymePartner;
	}

	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<BondType> getCarriers(int idx) {
		return drugList.get(idx).getCarriers().getCarrier();
	}

	/**
	 * 
	 * @param idx
	 * @return
	 */
	public List<BigInteger> getCarriersPartners(int idx) {
		ArrayList<BigInteger> carrierPartner = new ArrayList<BigInteger>();
		for (BondType bt: getCarriers(idx))
			carrierPartner.add(bt.getPartner());
		return carrierPartner;
	}

	/**
	 * 
	 * @param idx
	 * @return KEGG Number from External Identifiers
	 */
	public String getKEGGDrug(int idx) {
		for (ExternalIdentifier eid: drugList.get(idx).getExternalIdentifiers().getExternalIdentifier()) {
			//System.out.println(eid.getResource()+"\t"+eid.getIdentifier());
			if (eid.getResource().equalsIgnoreCase("KEGG Drug"))
				return eid.getIdentifier();
		}
		return null;
	}

	/**
	 * 
	 * @param idx
	 * @return PubChem Compound from External Identifiers
	 */
	public Integer getPubChemCompound(int idx) {
		for (ExternalIdentifier eid: drugList.get(idx).getExternalIdentifiers().getExternalIdentifier()) {
			//System.out.println(eid.getResource()+"\t"+eid.getIdentifier());
			if (eid.getResource().equalsIgnoreCase("PubChem Compound"))
				return new Integer(eid.getIdentifier());
		}
		return null;
	}

	/**
	 * Read DrugBank data into memory and build up dictionaries
	 * @param database the directory of the drugbank database
	 * @throws JAXBException
	 */
	public DrugBank(String database) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Drugs.class);
		Unmarshaller um = context.createUnmarshaller();
		drugs = (Drugs) um.unmarshal(new File(database+DATAFILE));
		drugList = drugs.getDrug();

		name2idx = new HashMap<String, Integer>();
		synonyms2idx = new HashMap<String, Integer>();
		pubChemCom2idx = new HashMap<Integer, Integer>();
		id2idx = new HashMap<String, Integer>();
		for (int i=0; i<size(); i++) {
			name2idx.put(getName(i).toLowerCase(), i);
			for (String name: getSynonyms(i))
				synonyms2idx.put(name.toLowerCase(), i);
			Integer compound = getPubChemCompound(i);
			if (compound != null)
				pubChemCom2idx.put(compound, i);
			for (String id: getIDs(i))
				id2idx.put(id, i);
		}
		//getSynonyms(idx)
		//getBrands(idx)
	}

	/**
	 * 
	 * @param name the drug name
	 * @return corresponding index, -1 if not found
	 */
	public int searchName(String name) {
		if (name2idx.containsKey(name.toLowerCase()))
			return name2idx.get(name.toLowerCase());
		else return -1;
	}

	/**
	 * 
	 * @param name the drug name
	 * @return corresponding index, -1 if not found
	 */
	public int searchSynonyms(String name) {
		if (synonyms2idx.containsKey(name.toLowerCase()))
			return synonyms2idx.get(name.toLowerCase());
		else return -1;
	}

	/**
	 * 
	 * @param compound the PubChem compound id
	 * @return corresponding index, -1 if not found
	 */
	public int searchPubChem(int compound) {
		if (pubChemCom2idx.containsKey(compound))
			return pubChemCom2idx.get(compound);
		else return -1;
	}

	/**
	 * There are some obsolete entries like DB01383 Insulin
	 * @param id the drugbank ID
	 * @return corresponding index, -1 if not found
	 */
	public int searchID(String id) {
		if (id2idx.containsKey(id))
			return id2idx.get(id);
		else return -1;
	}
}
