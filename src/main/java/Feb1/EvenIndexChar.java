package Feb1;

public class EvenIndexChar {

	public static void main(String[] args) {
		
		String str = "This java programming";
		
		
		for(int i =0 ; i< str.length(); i++) {
			if(i%2==0) {
				System.out.print(str.charAt(i) );
			}
			
			
		}

	}

}
