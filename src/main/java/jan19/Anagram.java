package jan19;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Rakesh";
		String s2 = "hakesR";

		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean value =Arrays.equals(ch1, ch2);
			
			if(value== true) {
				System.out.println(" both are anagram");
			}
			else {
				System.out.println("not anagram");
			}
		}

	}

}
