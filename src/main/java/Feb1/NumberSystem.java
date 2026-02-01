package Feb1;

public class NumberSystem {

	public static void main(String[] args) {

		// sum of digit

		int num = 153;
		int sum = 0;
		int rem ;

		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;

		}
		
		System.out.println(sum);
		
		// Aramstrong number
		
		int arm =0;
		while(num >0) {
			 rem = num %10;
			 num = num/10;
			 
			 arm = arm + rem*rem*rem;
		}

		
		System.out.println(arm);
	}

}
