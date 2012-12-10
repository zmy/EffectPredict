package extractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extracts data from <a href="http://www.kegg.jp/kegg/rest/">KEGG</a>.
 * @author zmy
 *
 */
public class KEGG {

	static final String KEGGREST = "http://rest.kegg.jp/";

	static public enum Database {
		PATHWAY	("pathway",	"path"),
		BRITE	("brite",	"br"),
		MODULE	("module",	"md"),
		DISEASE	("disease",	"ds"),
		DRUG	("drug",	"dr"),
		ENVIRON	("environ",	"ev"),
		ORTHOLOGY	("orthology",	"ko"),
		GENOME	("genome",	"genome"),	
		GENOMES	("genomes",	"gn"),
		GENES	("genes",	null),
		LIGAND	("ligand",	"ligand"),
		COMPOUND	("compound",	"cpd"),
		GLYCAN	("glycan",	"gl"),
		REACTION	("reaction",	"rn"),
		RPAIR	("rpair",	"rp"),
		RCLASS	("rclass",	"rc"),
		ENZYME	("enzyme",	"ec");

		String name;
		Database(String name, String abbrev) {
			this.name = name;
		}
		public String toString() {
			return name;
		}
	}
	
	static public enum RetrievalOption {
		AASEQ	("aaseq"),
		NTSEQ	("ntseq"),
		MOL	("mol"),
		KCF	("kcf"),
		IMAGE	("image");

		String name;
		RetrievalOption(String name) {
			this.name = name;
		}
		public String toString() {
			return name;
		}
	}

	static public class Parser {
		static public List<String> extractPathways(String str) {
			ArrayList<String> pathways = new ArrayList<String>();
			Pattern p = Pattern.compile("path:(?<path>[\\w]*)");
			Matcher m = p.matcher(str);
			while (m.find())
				pathways.add(m.group("path"));
			return pathways;
		}
		
		static public String extractUniProtIDs(String str) {
			Pattern p = Pattern.compile("UniProt: (?<ids>.*)");
			Matcher m = p.matcher(str);
			String ret="";
			if (m.find()) {
				ret = m.group("ids");
				System.out.println(ret);
			}
			else System.out.println("Not Found!");
			return ret;
		}
	}

	static String GET(String link) throws IOException {
		URL url = new URL(link);
		URLConnection urlc = url.openConnection();
		urlc.setDoInput(true);
		urlc.setAllowUserInteraction(false);
		BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
		String l, str = new String("");
		while((l = br.readLine()) != null) {
			str += l+"\n";
		}
		br.close();
		return str;
	}

	static public String databaseInformation(Database database) throws IOException {
		return GET(KEGGREST+"info/"+database);
	}

	static public String entryList() {
		return "list";//TODO:
	}

	static public String dataSearch() {
		return "find";//TODO:
	}

	static public String dataRetrieval(String dbentries) throws IOException {
		return GET(KEGGREST+"get/"+dbentries);
	}
	
	static public String dataRetrieval(String dbentries, RetrievalOption option) throws IOException {
		return GET(KEGGREST+"get/"+dbentries+"/"+option);
	}

	static public String idConversion() {
		return "conv";//TODO:
	}

	static public String linkedEntries(Database target_db, Database source_db) throws IOException {
		//TODO: pathway | brite | module | disease | drug | environ | ko | genome | <org> | compound | glycan | reaction | rpair | rclass | enzyme
		return GET(KEGGREST+"link/"+target_db+"/"+source_db);
	}

	static public String linkedEntries(Database target_db, String dbentries) throws IOException {
		//TODO: pathway | brite | module | disease | drug | environ | ko | genome | <org> | compound | glycan | reaction | rpair | rclass | enzyme
		return GET(KEGGREST+"link/"+target_db+"/"+dbentries);
	}

}
