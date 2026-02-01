package jan15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DupliacteChar {

	
	public static void main(String[] args) {
		
		String str = "java programming with automation";
		
		Map<Character,Integer> hm = new HashMap<>();
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> mp: hm.entrySet()) {
			System.out.println(mp.getKey() +"->" +mp.getValue());
		}
		
	}
}
