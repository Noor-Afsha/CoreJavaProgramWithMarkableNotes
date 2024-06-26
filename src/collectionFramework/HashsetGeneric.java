package collectionFramework;

import java.util.HashSet;

public class HashsetGeneric {

	public static void main(String[] args) {
//generic way hashset
//		HashSet<Integer> hs = new HashSet<Integer>();
//		hs.add(100);
//		hs.add(20);
//		hs.add(234);
//		hs.add(908);
//
//		System.out.println(hs);
//
//		String s[] = { "noor", "roori", "ram", "ram", "noor", "afsha" };
//		for (int i = 0; i < s.length; i++) {
//			System.out.print(s[i] + " ");
//		}
//		HashSet<String> hs = new HashSet<String>();
//		for (int i = 0; i < s.length; i++) {
//			hs.add(s[i]);
//		}
//		System.out.println(hs);

		// here i am using custom generic type, which is user defined
		HashSet<Student> hs = new HashSet<>();

		Student s = new Student(10, "noor", "colleg");

		Student s1 = new Student(10, "afsha", "colleg");

		hs.add(s);
		hs.add(s1);
		System.out.println(hs);

	}
}
