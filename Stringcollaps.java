package com.java.joe;

import java.util.Scanner;

public class Stringcollaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your String1");
		str1=obj.nextLine();
		System.out.println("Enter your String2");
		str2=obj.nextLine();
		for(int i=0;i<str1.length();i++){
			System.out.print(str1.charAt(i));
			System.out.print(str2.charAt(i));
			
			
		}
        
	}

}
