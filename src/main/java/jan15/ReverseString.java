package jan15;

public class ReverseString {

	public static void main(String[] args) {

		String str = "java programming with automation";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.print(rev +"\n ");

		if (str.equals(rev)) {
			System.out.println("panindrom");
		} else {
			System.out.println("not palindrom");
		}
		
		
		
	}

}
