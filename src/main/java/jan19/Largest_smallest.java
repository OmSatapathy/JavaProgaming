package jan19;

public class Largest_smallest {

	public static void main(String[] args) {

		int largest = -1;
		int secondlargest = -1;

		int[] arr = { 20, 30, 40, 12, 4, 62, 38,77 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];

			}

			else if (arr[i] < largest && arr[i] > secondlargest) {
				secondlargest = arr[i];
			}

		}

		System.out.println(largest);
		System.out.println(secondlargest);

		// duplicate number

		int[] arr1 = { 20, 55, 40, 12, 4, 62, 38, 663, 55, 40, 56 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println("duplicates are: " + arr1[j]);
				}
			}
		}

		
		// 
	}

}
