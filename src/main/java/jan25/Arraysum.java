package jan25;

public class Arraysum {

	public static void main(String[] args) {
		
		int sum =0;
		int[] arr = { 20, 30, 40, 12, 4, 62, 38 };
		
		for(int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);

	}

}
