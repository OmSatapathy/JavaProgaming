package com.basic;

public class Primenumber {
	
	public static void main(String[] args) {
		
		
		isPrime(11);
	}

	
	public static void isPrime( int number ) {
		if (number%1 == number && number%number == 1) {
            System.out.println(number + " is a prime num");
        }
		
		else {
			System.out.println("not a prime");
		}
	}
}
