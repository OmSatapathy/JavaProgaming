package jan15;

public class CaptSamll {

	public static void main(String[] args) {

		String s = "AbCde";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				 result= result+Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c)) {
				result= result+ Character.toUpperCase(c);
			}

		}

		
		System.out.println(result);
	}

}
