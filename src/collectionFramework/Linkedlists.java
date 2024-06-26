package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlists {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("noor");
		ll.add(10);
		ll.add(89.09);
		ll.add('c');
		ll.add(2345);
		ll.add(10);
		ll.add(true);
		ll.add(false);
		ll.add(10);
		ll.add(null);
		ll.add(null);
		ll.add("fghj");
		ll.push("mohan");

//		System.out.println(ll.contains("noor"));
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.offer("ram"));//offer is similar to add method
//		System.out.println(ll.offerFirst("sita"));//it will add at o index
//		System.out.println(ll.peek());
//		System.out.println(ll.poll());//it will retreve and remove the first element from the list
//		System.out.println(ll.pop());//it will return first element and remove the first element from the list 
//		System.out.println(ll.set(0, 100));
//		System.out.println(ll);

		LinkedList ll1 = new LinkedList();
		ll1.add("noor");
		ll1.add(10);
		ll1.add(89.09);
		ll1.add('c');
		ll1.add(2345);
		ll1.add(10);

		ArrayList al = new ArrayList();
		al.add(false);
		al.add(10);
		al.add(null);

		ll.addAll(al);
		System.out.println(ll);

		// now generic way hence if we are using generic then specific data types only we can use as mentioned in exammple
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(10);
		list.add(123456);
		
//		Iterator<Integer> i=list.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		for(Integer i:list) {
//			System.out.println(i);
//		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
