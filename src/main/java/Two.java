
public class Two {

	public static void main(String[] args) {
		
		String str = "Om prakash satapathy";
		
		char[] ch = str.toCharArray();
		
		String rev ="";
		
		for(int i = ch.length-1; i>=0; i--) {
			rev = rev + ch[i];
		}
		
		System.out.println(rev);

	}

}
