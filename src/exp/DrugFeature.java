package exp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The features of a drug
 * @author zmy
 *
 */
public class DrugFeature {
	ArrayList<List<Integer>> idxs;
	ArrayList<Indexer> indexers;
	int length;

	/**
	 * add a feature which can be or not
	 * @param idx
	 * @param indexer
	 * @return 
	 */
	public void addFeature(List<? extends Object> keys, Indexer indexer) {
		idxs.add(indexer.getIndex(keys));
		indexers.add(indexer);
	}

	public DrugFeature() {
		idxs = new ArrayList<List<Integer>>();
		indexers = new ArrayList<Indexer>();
		length = 0;
	}

	public int length() {
		length = 0;
		for (Indexer indexer: indexers)
			length += indexer.size();
		return length;
	}
	
	/**
	 * After call this you should not modify indexers any more.
	 * @return
	 */
	public boolean[] toBinary() {
		boolean[] binary = new boolean[length()];
		Arrays.fill(binary, false);
		for (int i=0, st=0; i<idxs.size(); i++) {
			for (Integer idx: idxs.get(i))
				binary[st+idx] = true;
			st += indexers.get(i).size();
		}
		return binary;
	}
	
	public String toString() {
		String str = "";
		boolean[] binary = toBinary();
		for (boolean val: binary)
			if (val) str = str+"1";
			else str = str+"0";
		return str;
	}
}
