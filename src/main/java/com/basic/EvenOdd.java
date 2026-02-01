package com.basic;

public class EvenOdd {

	public static void main(String[] args) {

		isPrime(32);
		
	}
	
	
	public static int isPrime(int n) {
		
	
		if(n %2==0) {
			 System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		

		return n;

		
	}

}
