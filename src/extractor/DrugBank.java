package util;

import java.io.File;
import java.util.List;

import javax.xml.bind.*;

import ca.drugbank.*;

public class DrugBank {

	static final String DATABASE = "data/drugbank.xml";

	public static void main(String args[]) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Drugs.class);
		Unmarshaller um = context.createUnmarshaller();

		Drugs drugs = (Drugs) um.unmarshal(new File(DATABASE));
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
	}
}
