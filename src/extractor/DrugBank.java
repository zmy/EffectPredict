package extractor;

import java.io.File;
import java.util.List;

import javax.xml.bind.*;

import extractor.ca.drugbank.*;


/**
 * Extracts data from <a href="http://www.drugbank.ca/">DrugBank</a>.
 * @author zmy
 *
 */
public class DrugBank {

	public class Feature {
		/**
		 * Name
		 */
		String name;
		/**
		 * ID (Accession Number)
		 */
		String[] id_access;
		/**
		 * Type
		 */
		String type;
		/**
		 * Groups
		 */
		String[] groups;
		/**
		 * Substructures
		 */
		
		/**
		 * Drug Interactions
		 */
		
		/**
		 * Targets
		 */
		
		/**
		 * Transporters
		 */
		
		/**
		 * Enzymes
		 */
		
	}
	
	Drugs drugs;
	
	public DrugBank(String database) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Drugs.class);
		Unmarshaller um = context.createUnmarshaller();

		drugs = (Drugs) um.unmarshal(new File(database));
		List<DrugType> drugList = drugs.getDrug();

		/* Following is an example to get information */
		DrugType Drug0 = drugList.get(1000);
		System.out.println("Name: "+Drug0.getName());
		System.out.print("Accession Number: "+Drug0.getDrugbankId()+"(");
		boolean first = true;
		for (String no: Drug0.getSecondaryAccessionNumbers().getSecondaryAccessionNumber()) {
			if (first) first = false;
			else System.out.print(", ");
			System.out.print(no);
		}
		System.out.println(")");
		
		System.out.println("Type: "+Drug0.getType());
		System.out.println("Groups:");
		for (String grp: Drug0.getGroups().getGroup()) {
			System.out.print("\t"+grp);
		}
		System.out.println();
		System.out.println("Substructures:");
		List<Substructure> substructureList0 = Drug0.getTaxonomy().getSubstructures().getSubstructure();
		for (Substructure sub: substructureList0) {
			System.out.println("\t"+sub.getValue());
		}
		Drug0.getTargets();
		Drug0.getTransporters();
		Drug0.getEnzymes();
		
		for (ExternalLink elink: Drug0.getExternalLinks().getExternalLink())
			if (elink.getResource().equalsIgnoreCase("KEGG")) {
				elink.getUrl();
			}
		//http://rest.kegg.jp/link/pathway/D07057
		
	}
}
