package collectionFramework;

import java.util.TreeSet;

public class Treeeset {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<>();

		String s[] = { "aadi", "aana", "abba", "amma" };
//		t.add(567);
//		t.add(234);

//		t.add("ewd");
//		t.add("wer");
//		t.add("aa");
//		System.out.println(t);

		for (int i = 0; i < s.length; i++) {
			t.add(s[i]);
		}
		System.out.println(t);

	}
}
