package Feb14;

import java.util.Random;

public class DigitSum {

	public static void main(String[] args) {
		int n = 8;

		int sum = 0;

		sum = n * (n + 1) / 2;
		System.out.println(sum);

		// leap year

		int yr = 2016;

		if (yr % 4 == 0 && yr % 100 != 0) {
			System.out.println("leap yr");
		} else {
			System.out.println("not a leap yr");
		}
		
		// generate random number
		
		Random rm = new Random();
		for(int i =0; i<2; i++) {
			System.out.println(rm.nextInt(200));
		}

	}

}
