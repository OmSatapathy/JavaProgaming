package jan19;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Automation is done";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

		String[] sp = str.split(" ");
		for (String s : sp) {
			System.out.println(s);
		}
      String lowercase = str.toLowerCase();
		
		int vowal=0, consonat =0;
		
		for(int i =0; i< lowercase.length() ; i++) {
			char ch = lowercase.charAt(i);
			if(ch=='a' || ch =='e' || ch == 'i' || ch =='o' || ch =='u' ) {
				vowal++;
			}
			else if(ch >= 'a' && ch <='z') {
				consonat++;
			}
		}

		System.out.println("Number of vowels: " + vowal);
		System.out.println("Number of vowels: " + consonat);
	}

}
