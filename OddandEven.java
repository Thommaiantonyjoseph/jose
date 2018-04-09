package com.java.joe;

import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=obj.nextInt();
		
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
		
	}

}
