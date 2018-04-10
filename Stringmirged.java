package com.java.joe;

import java.util.Scanner;

public class Stringmirged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter str1");
		str1=obj.nextLine();
		System.out.println("Enter str2");
		str2=obj.nextLine();
		
		String str=mixString(str1,str2);
		System.out.println(str);
		
	}

	private static String mixString(String a, String b) {
		// TODO Auto-generated method stub
		String str3="";
		int len=0;
		
		if(a.length()>b.length())
			len+=a.length();
		else
			len+=b.length();
		
		for(int i=0;i<len;i++){
			
			if(i<a.length())
			str3=str3+a.charAt(i);
			if(i<b.length())
				str3+=b.charAt(i);
			}
		
		return str3;
	}

}
