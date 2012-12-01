package exp;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Indexer {

	HashMap<Object, Integer> dict;

	//TODO: check if this Object thing works
	int getIndex(Object key) {
		if (dict.containsKey(key))
			return dict.get(key);
		else {
			int idx = dict.size();
			dict.put(key, idx);
			return idx;
		}
	}

	/**
	 * 
	 * @param keys
	 * @return
	 */
	public List<Integer> getIndex(List<? extends Object> keys) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Object key: keys)
			list.add(getIndex(key));
		return list;
	}

	public int size() {
		return dict.size();
	}

	public Indexer() {
		dict = new HashMap<Object, Integer>();
	}

}
