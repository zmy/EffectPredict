package exp.preprocessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import extractor.KEGG;

/**
 * 
 * @author zmy
 *
 */
public class KEGGHSA2UniProt {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		for (String file: args) {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file+".txt"));
			String str;
			while ((str = reader.readLine()) != null)
				if (!str.isEmpty()) {
					String ret = KEGG.dataRetrieval(str.substring(0, str.indexOf('\t')));
					//System.out.println(ret);
					writer.write(KEGG.Parser.extractUniProtIDs(ret));
					writer.write(System.lineSeparator());
				}
			reader.close();
			writer.close();
		}
	}

}
