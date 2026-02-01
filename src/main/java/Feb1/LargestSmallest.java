package Feb1;

public class LargestSmallest {

	public static void main(String[] args) {
		int[] arr1= {38,14,16,72,1,15,8};
		
		int max = arr1[0];

		int min = arr1[0];
		
		for(int i =0; i< arr1.length; i++) {
			if(arr1[i]>max) {
				max=arr1[i];
				System.out.println(max);
			}
		
			
			else if(arr1[i]<min) {
				min = arr1[i];
				System.out.println(min);
			}
		}

	}

}
