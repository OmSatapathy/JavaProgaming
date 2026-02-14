package Feb14;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {

		String str = "automation testing and process";

		char[] ch = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();

		for (char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		for (java.util.Map.Entry<Character, Integer> ent : hm.entrySet()) {
			
			if(ent.getValue() ==3) {
				System.out.println(ent.getKey() + ":" + ent.getValue());
			}
		}
	}
}
