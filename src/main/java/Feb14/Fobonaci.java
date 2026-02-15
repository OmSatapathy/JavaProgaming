package Feb14;

public class Fobonaci {

	public static void main(String[] args) {
		int n = 7, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

		// factorial
		int num = 7;
		int fact = 1;

		for (int i = 1; i < num; i++) {

			fact = fact * i;

		}
		
		System.out.println(fact);
	}

}
