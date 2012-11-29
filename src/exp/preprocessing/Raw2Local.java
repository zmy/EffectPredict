package exp.preprocessing;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import extractor.DrugBank;
import extractor.KEGG;
import extractor.SIDER;
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
		int idx = drugbank.searchName("Acebutolol");
		System.out.println(drugbank.getSubStructures(idx));
		System.out.println(drugbank.getInteractions(idx));
		
		/*for (TargetBondType tbt: drugbank.getTargets(idx)) {
			System.out.println(tbt.getPartner());
			System.out.println(tbt.getPosition());
			System.out.println(tbt.getKnownAction());
			System.out.println(tbt.getReferences());
			System.out.println(tbt.getActions().getAction());
		}*/
		
		System.out.println(drugbank.getKEGGD(idx));
		System.out.println(KEGG.linkedEntries(KEGG.Database.PATHWAY, drugbank.getKEGGD(idx)));
	}

}
