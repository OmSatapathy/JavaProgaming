import java.util.HashMap;
import java.util.Map;

public class Three {

	
	public static void main(String[] args) {
		
		String str = "Om prakash Satapthy";
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c: ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
				
			}
		}
		
		
		for(Map.Entry<Character, Integer> hm : map.entrySet()) {
			if(hm.getValue()>1) {
				System.out.println(hm.getKey() +" "+ hm.getValue());
			}
		}
		
	}
}
