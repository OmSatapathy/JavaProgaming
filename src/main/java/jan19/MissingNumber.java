package jan19;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr={3, 4, 5, 6, 7, 1};
		int sum=0;
		int originalsum;
		int len = arr.length+1;
		
		 for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
		
		
		originalsum =len*(len+1)/2;
		
		System.out.println(originalsum - sum);

	}

}
