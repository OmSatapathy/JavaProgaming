package jan19;

public class Secondlargest {

	public static void main(String[] args) {
		int[] arr = { 32, 44, 35, 26, 17, 13 };

		int largest = -1, secondLargest = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}

		}
		System.out.println(secondLargest);
		
		
		// String compress
		
		String str ="aabbbbcccddddeee";
	
		StringBuilder compressed = new StringBuilder();
		   int count = 1;

		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			}
			else if(str.charAt(i) != str.charAt(i-1)) {
				compressed.append(str.charAt(i - 1)).append(count);
				count=1;
			}
		}
		
		System.out.println(compressed);
	}

}
