package jan25;

public class Reversenumber {

	public static void main(String[] args) {
		
		int originalnumber =853;
		
		int rev =0, num;;
		
		while(originalnumber>0) {
			int rem = originalnumber %10;
			 rev = rev *10 + rem;
			 originalnumber/=10;
		}
		
		System.out.println("reverse :" + rev);
	}

}
