package map;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {

//		HashMap h=new HashMap();
//		
//		h.put(null, "nor");
//		h.put(null, "nr");
//		h.put(12, " " );
//		h.put(123, " ");
//		h.put(12, "");
//		h.put(null, null);
//		System.out.println(h);

		HashMap<Integer, String> h = new HashMap<>();

		h.put(1, "aadi");
		h.put(12, "aadi");
		h.put(1234, "noor");
		
		System.out.println(h.get(1));
		System.out.println(h.size());
		System.out.println(h.remove(12));
		System.out.println(h.replace(12, "aadi", "mona"));
		System.out.println(h.replace(1, "youtuber"));
		h.clear();
		System.out.println(h.isEmpty());

		System.out.println(h);
	}
}
