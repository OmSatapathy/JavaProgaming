package Feb1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringProg {

	public static void main(String[] args) {

		String str = "the sky is blue";

		String strWords[] = str.split("\\s+");
		String rev = "";
		for (String sw : strWords) {
			StringBuilder sb = new StringBuilder(sw);
			sb.reverse();
			rev = rev + sb.toString() + " ";
		}
		System.out.println("The modified string is: " + rev.trim());

		// duplicate character in string
		String str1 = "we are into qa auomation";

		char[] ch = str1.toCharArray();

		Map<Character, Integer> hm = new HashMap<>();

		for (char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		for (Entry<Character, Integer> ent : hm.entrySet()) {

			System.out.println(ent.getKey() + "==>" + ent.getValue());

		}

		// duplicate

		Set<Character> set = hm.keySet();
		
		for(char cm : set) {
			if(hm.get(cm)>1) {
				System.out.println(cm +"::" + hm.get(cm));
			}
		}

	}

}
