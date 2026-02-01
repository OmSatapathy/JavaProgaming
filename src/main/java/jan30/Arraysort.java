package jan30;

public class Arraysort {

	public static void main(String[] args) {

		int temp;
		int[] arr = { 4, 12, 56, 34, 9, 17 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		
		for(int p: arr) {
			System.out.println(p);
		}
	}

}
