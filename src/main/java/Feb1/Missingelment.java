package Feb1;

public class Missingelment {

	public static void main(String[] args) {
		
		int[] num = {1,3,4,5,6};
		
		int sum =0;
		for(int i =0; i< num.length; i++) {
			sum = sum+ num[i];
		}

		
		int originalSum;
		 int len = num.length+1; // since 1 number is missing
		 
		 originalSum = len*(len+1)/2;
		 System.out.println(originalSum-sum);
	}

}
