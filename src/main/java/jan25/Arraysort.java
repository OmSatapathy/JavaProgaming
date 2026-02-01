package jan25;

public class Arraysort {

	public static void main(String[] args) {

		int[] arr = { 20, 30, 40, 12, 4, 62, 38 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		for (int c : arr) {
			System.out.println(c);
		}
	}

}
