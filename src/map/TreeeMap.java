package map;

import java.util.TreeMap;

public class TreeeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(3, "Noor");
		t.put(2, "dfcgbhjn");
		t.put(1, "ram");

//		t.clear();
//		System.out.println(t.get(1));
//		System.out.println(t.isEmpty());
//		System.out.println(t.replace(1, "kirsihna"));
		System.out.println(t.descendingKeySet());

	}
}