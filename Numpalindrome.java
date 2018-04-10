package com.java.joe;

import java.util.Scanner;

public class Numpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner (System.in);
		System.out.println("Enter Number");
		int num=obj.nextInt();
		int reverse=0,ans=num;
		while(num>0){
		
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			
		}	
		System.out.println(reverse);
		if(ans==reverse)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
	}

}
