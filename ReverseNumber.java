package com.edu.loop;
import java.util.Scanner;

public class ReverseNumber {

			public static void main(String[] args) {
				int num,digit;
				int rev=0;
				Scanner sc =new Scanner(System.in);
				
				System.out.println("Enter number");
				num=sc.nextInt();// 123(input)   321(output)
		       /* digit=num%10;  //123%10
		         System.out.print(digit); //3
		         num=num/10; //123/10=12
		         digit=num%10; //digit=2
		         System.out.print(digit); //32
		         num=num/10; //12/10=1
		         digit=num%10;  //12%10=1
		         System.out.print(digit); //321
		         num=num/10; //1/10=0*/
				
				while(num!=0) {
					digit=num%10;
					//System.out.print(digit);
					rev=rev*10+digit;
					num=num/10;
				}
				System.out.println("Reverse number is "+rev);
				 
			}

		

		
	}


