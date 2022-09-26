package com.edu.loop;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int number=100;
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
        System.out.println("factorial of"+number+" is "+fact);
	}

}
