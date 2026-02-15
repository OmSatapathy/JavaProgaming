package Feb14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommanElement {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };

		Set<Integer> set1 = new HashSet<>();

		for (int i : arr1) {
			set1.add(i);
		}

		for (int i : arr2) {
			if (set1.contains(i)) {
				System.out.println(i);
			}
		}

		// remove white space

		String str = "ram krishna mahadev";
		String n = str.replaceAll("\\s+", "");
		System.out.println(n);

		String sp = str.replaceAll(" ", "");
		System.out.println(sp);

		// First Non-Repeated

		char[] ch = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();

		for (char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> ent: hm.entrySet()) {
			
			if(ent.getValue()==1) {
				System.out.println(ent.getKey() +" : "+ent.getValue());
			}
		}

	}

}
