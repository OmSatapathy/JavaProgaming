package jan30;

public class RemoveSplchar {

	public static void main(String[] args) {

		String str = "Kesav763&*(rwa";

		String str1 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str1);

		String name = " om prakash satapathy";
		System.out.println(name.replaceAll(" ", ""));

		char[] ch = name.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (Character.isAlphabetic(i)) {
				Character.toLowerCase(i);
				System.out.println(i);
			}
		}

	}

}
