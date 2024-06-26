package collectionFramework;

import java.util.HashSet;

public class SpecificHasSetGeneric {

	public static void main(String[] args) {

//		int arr[] = { 12, 23, 34, 12, 12, 34, 4, 6 };
//		HashSet<Integer> hs = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			hs.add(arr[i]);
//		}
//		System.out.println(hs);

		HashSet<Worker> hs = new HashSet<>();

		Worker w = new Worker(10, "mazdoor", "abc", 10.23);
		Worker w1 = new Worker(20, "ehrefh", "eff", 10.23);

		hs.add(w);
		hs.add(w1);

		for (Worker worker : hs) {
			if (worker.getName().contains("mazdoor")) {
				System.out.println(worker);
			}
		}

	}
}
