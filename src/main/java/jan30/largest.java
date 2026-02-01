package jan30;

public class largest {

	public static void main(String[] args) {

		int max = -1;
		int secondmax = -1;

		int[] arr = { 45, 6, 54, 23, 9, 16, 37 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			} else if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondmax);
	}

}
