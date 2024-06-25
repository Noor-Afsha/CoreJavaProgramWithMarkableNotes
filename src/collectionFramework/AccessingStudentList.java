package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class AccessingStudentList {

	public static void main(String[] args) {

		ArrayList<Student> student = new ArrayList<Student>();

		ArrayList<Employee> employees = new ArrayList<>();

		// by creating object
//		Student s = new Student(10, "noor", "rr");
//		Student s1 = new Student(12, "afsha", "it");
//		Student s2 = new Student(12, "khatoon", "technology");

		student.add(new Student(12, "noor", "rt"));
		student.add(new Student(12, "noori", "rt"));
		student.add(new Student(13, "susma", "imt"));
		student.add(new Student(123, "rani", "eds"));

		// for each loop
		// if student belongs to rt college then print
		for (Student s : student) {
			if (s.getCollege().equals("rt") && s.getName().equals("noor")) {
				System.out.println(s);
				
			}
		}
		System.out.println("==============================================");

		// while loop
//		Iterator<Student> ss = student.iterator();
//		while (ss.hasNext()) {
//			System.out.println(ss.next());
//		}
//		
//		for(int i=0; i<student.size();i++) {
//			System.out.println(student.get(i));
//		}

		employees.add(new Employee(1, "nori"));
		employees.add(new Employee(23, "ravi"));

//		for (Employee e : employees) {
//			System.out.println(e);
//
//		}

//		Iterator<Employee> e = employees.iterator();
//		while (e.hasNext()) {
//			System.out.println(e.next());
//		}
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}
	}
}
