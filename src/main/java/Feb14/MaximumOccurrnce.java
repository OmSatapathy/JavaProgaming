package Feb14;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurrnce {

	public static void main(String[] args) {
		String str = "programmingin";

		Map<Character, Integer> hm = new HashMap<>();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		char maxChar = str.charAt(0);
		int maxCount = 0;
		for (char c : hm.keySet()) {
			if (hm.get(c) > maxCount) {
				maxCount = hm.get(c);
				maxChar = c;
			}
		}
		System.out.println(maxChar);
		
		String str1 = "Automation Testing";
		 String str2 = "Testing";
		 System.out.println(str1.contains(str2));
		 
	}

}
