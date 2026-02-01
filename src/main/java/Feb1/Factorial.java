package Feb1;

public class Factorial {

	public static void main(String[] args) {

		int num = 7;
		int fact = 1;

		for (int i = 1; i < num; i++) {
			fact = fact * i;
		}

		System.out.println(fact);

		// reverse a number

		int numb = 9653;
		int rem;
		int rev = 0;

		while (numb > 0) {
			rem = numb % 10;
			rev = rev * 10 + rem;
			numb = numb / 10;

		}

		System.out.println("reverse number: " + rev);

		if (numb == rev) {
			System.out.println(" number is anagaram");
		}

		else {
			System.out.println("not a anagaram");
		}

		// sum of numbr

		int num1=632;
		int sum = 0;
		while (numb != 0) {
			sum += num1 % 10; // sum =sum+numb1 %10;
			                 // num1= num1 /10;
			num1 /= 10;
		}

		System.out.println(sum);
	}

}
