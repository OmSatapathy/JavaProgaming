package jan30;

public class Reversenumber {

	public static void main(String[] args) {
		int rev=0, rem;
		int sum =0;
		int num =7346; 	
		while(num>0) {
			rem = num %10;
			rev = rev*10 + rem;
			num=num/10;
		}

		System.out.println(rev);
		
		
		if(num == rev) {
			System.out.println(" Pallindrom");
		}
		else {
			System.out.println("not a pallindrom");
		}
		
		//*********************//
		while (num > 0) {
			sum = sum*num  %10;
			num = num/10;
		}
		
		System.out.println(sum);
	}

}
