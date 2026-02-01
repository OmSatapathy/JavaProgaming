package jan30;

public class Factorial {

	public static void main(String[] args) {
		int num = 7;
		int p = 1;

		for (int i = 1; i < num; i++) {
			p = p * i;
		}

		System.out.println(p);
	}

}
