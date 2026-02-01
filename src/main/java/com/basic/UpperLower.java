package com.basic;

public class UpperLower {

	public static void main(String[] args) {
		String str = "AbCd";

		int len = str.length();
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i< len; i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			}
			else {
				 sb.append(ch);
			}
		}
		
		System.out.println("Output: " + sb.toString());

	}

}
