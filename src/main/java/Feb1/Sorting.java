package Feb1;

public class Sorting {

	public static void main(String[] args) {
		int[] arr1= {38,14,16,72,1,15,8};
		
		for(int i =0; i< arr1.length-1; i++) {
			for(int j =i+1; j< arr1.length; j++) {
				if(arr1[i]> arr1[j]) {
					int temp = arr1[i];
					arr1[i] =arr1[j];
					arr1[j] = temp;
				}
			}
		}

		for(int x: arr1) {
			System.out.println(x);
		}
		
		// dupliacte element in array
		
		int[] arr= {38,14,16,72,1,15,8,67,14,5,72};
		
		for(int i =0; i< arr.length-1; i++) {
			for(int j =i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("dupliacte element: " +arr[j]);
				}
			}
		}
	}

}
