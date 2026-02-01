package jan15;

public class Occurrences_givenCharacter {

	public static void main(String[] args) {
		
		 String s = "Java is java again java again";
		 char c = 'a';
		 
		 int count = s.length() - s.replace("g", "").length();
		 
		// System.out.println(count);
		 
		 String[] str = s.split(" ");
		 
		 for(String sp : str) {
			 System.out.print(sp);
		 }

	}

}
