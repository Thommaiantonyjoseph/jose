package com.java.joe;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your reverse String");
		String str=obj.nextLine();
		
		for(int i=str.length()-1;i>=0;i--){
			
			char ch=str.charAt(i);
			System.out.print(ch);
			
		}
	}

}
