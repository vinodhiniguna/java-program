package com.edu.loop;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
       int terms,f1=1, f2=2,f3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		terms=sc.nextInt();
		System.out.println("Fibonacci series");
		System.out.println(f1);
		System.out.println(f2);

		 for(int i=1;i<=terms-2;i++) {
			 f3=f1+f2;
			 System.out.println(f3);
			 f1=f2;
			 f2=f3;
		 }



	}

}
