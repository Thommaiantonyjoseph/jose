package com.java.joe;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your reverse String");
		String str,reverse="";
		str=obj.nextLine();
		
		for(int i=str.length()-1;i>=0;i--){
			
			reverse= reverse+ str.charAt(i);
			//System.out.print(ch);
			
		}
		if(str.equals(reverse))
			System.out.println("Palindrome");
		

		else
			System.out.println("not Plindrome");
	}

}
