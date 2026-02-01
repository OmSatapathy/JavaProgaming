package array;

public class Largest {

	public static void main(String[] args) {

		int n = 5;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println(" ");
		}

		for (int row = n - 1; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println(" ");
		}

		double num = 66353.45324;

		String input = String.valueOf(num);

		System.out.println(input);
		
		int decval = input.indexOf(".");
		
		int len = input.length();
		
		System.out.println(len-decval-1);

	}

}
