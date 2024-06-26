package collectionFramework;

import java.util.Stack;
import java.util.Vector;

public class Vectors {
public static void main(String[] args) {
Vector v=new Vector();
	
	v.add(10);
	v.add("fghj");
	v.add(null);
	v.add(null);
	v.add(10);
	v.add('c');
	v.add(true);
	
//	System.out.println(v.get(3));
//	System.out.println(v.elementAt(2));
//	System.out.println(v.set(2, "mona"));
//	System.out.println(v.stream());
//	System.out.println(v);
//	
//	Iterator i=v.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
	
//	for(int i=0; i<v.size(); i++) {
//		System.out.println(v.get(i));
//	}	
	
	Stack s=new Stack();
	
	s.add(10);
	s.add("nooor");
	s.add('c');
	s.add(true);
	s.add(false);
	s.add(null);
	s.push("drfgyuh");
	System.out.println(s.peek());//stack menas first in last out FIFO
	System.out.println(s.pop());
	System.out.println(v);
}
	
}
