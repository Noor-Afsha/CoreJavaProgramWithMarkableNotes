package map;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashhTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> h = new Hashtable<>();
		h.put(1, "aa");
		h.put(2, "bb");
		h.put(3, "ff");

		h.entrySet();
		for (Entry<Integer, String> hh : h.entrySet()) {
			System.out.println(hh.getValue().charAt(1));
			System.out.println(hh.getKey());
		}
		System.out.println(h);
	}
}
