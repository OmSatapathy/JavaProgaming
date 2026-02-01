package jan15;

import java.util.Arrays;

public class Anagtam {

	public static void main(String[] args) {

		String s1 = "Rajan";
		String s2 = "jnara";

		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean result = Arrays.equals(ch1, ch2);

			if (result == true) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}

		}

		else {
			System.out.println(" not equal length");
		}

	}

}
