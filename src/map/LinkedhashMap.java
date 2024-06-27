package map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import collectionFramework.Student;

public class LinkedhashMap {

	public static void main(String[] args) {

//		LinkedHashMap<String, String> h=new  LinkedHashMap<String, String>();
//		h.put("adi", "asd");
//		h.put("manya", "dfgh");
//		System.out.println(h);

		LinkedHashMap<Integer, Student> h = new LinkedHashMap<>();

		Student s = new Student(1, "dds", "dd");
		Student s1 = new Student(12, "ss", "ddd");

		h.put(1, s);
		h.put(2, s1);
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.containsKey(1));
		
		h.entrySet();
		for(Entry<Integer,Student> mapObj:h.entrySet()) {
		System.out.println(mapObj.getKey());
		System.out.println(mapObj.getValue().getId());
		System.out.println(mapObj.getValue().getName());
		System.out.println(mapObj.getValue().getCollege());
		}
	}
}
