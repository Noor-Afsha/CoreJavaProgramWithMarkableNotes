package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("aadi");
		al.add("addi");
		al.add("ram");
		al.add(110.22);
		al.add(null);
		al.add(null);
		al.add(10);
		al.add(true);
		al.add(false);
		al.add('A');

//		al.clear();

		// array list method:-
		// setting the value in the place of existing data.
//		System.out.println(al.set(1, "noor"));
//		System.out.println(al.set(3, "sita"));

		// getting last data
//		System.out.println(al.get(al.size() - 1));

		// indexing or first index
//		System.out.println(al.get(0));

//		System.out.println(al.remove(4));

//		System.out.println(al.isEmpty());

//		System.out.println(al.size());

//		Collections.reverse(al);

//		System.out.println(al.contains("ramma"));
//		
//		System.out.println(al);

		// iterator using while loop
//		Iterator i=al.iterator();
//		
//		while(i.hasNext()) {
//			
//			System.out.println(i.next());
//		}

		//using for each loop
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		//using for each loop
		for(Object ob:al) {
			System.out.println(ob);
		}
	}
}
