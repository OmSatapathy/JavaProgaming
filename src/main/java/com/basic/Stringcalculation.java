package com.basic;

public class Stringcalculation {

	public static void main(String[] args) {
		
		String s = "t@#$%1e@#$%2s@#$%t3t4";
		
		String letters = s.replaceAll("[^0-9]", "");

		 // Step 3: extract numbers
		 String numbers = s.replaceAll("[^a-zA-Z]", "");
		 
		 System.out.println(numbers+letters);
	}

}
