package Feb1;

import java.util.HashSet;
import java.util.Set;

public class Vowels {

	public static void main(String[] args) {

		String str = "This java programming";
		char[] ch = str.toCharArray();
		int vcount = 0;
		int ccount = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vcount++;
			} else {
				ccount++;

			}
		}

		System.out.println(vcount);
		System.out.println("const:: " + ccount);

		Set<Character> set = new HashSet<>();
		for (char c : ch) {
			set.add(c);
		}
		
		System.out.println(set);
		
		
		

	}

}
