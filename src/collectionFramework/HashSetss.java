
package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetss {

	public static void main(String[] args) {

		HashSet hs = new HashSet<>();

		hs.add(10);
		hs.add("dfghj");
		hs.add(true);
		hs.add('c');
		hs.add(1232.324);
		hs.add(10);
		hs.add(null);
		hs.add(null);

		// here duplicate value are not printing nor giving compiler or run time kind of
		// error.

		Iterator i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(hs);

	}
}
