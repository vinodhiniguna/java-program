package com.edu.loop;

import java.util.Scanner;
 class PrimeCheck {

	public static void main(String[] args) {
		int i,num,count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number:");
		num=sc.nextInt();
		
		for(i=2;i<num;i++)
		{
			if(num%i ==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
			System.out.println(num+"is a prime number");
		else
			System.out.println(num+"is not a prime number");



	}

}
