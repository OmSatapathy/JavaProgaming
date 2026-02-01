package jan19;

public class StringCompress {

	public static void main(String[] args) {
		
		String str ="aaaabbcccdddd";
		
		StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length()-1; i++) {

            // If next char is same, increase count
            if ( str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append character and its count
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        System.out.println(compressed);
	}

}
