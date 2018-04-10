package com.java.joe;

import java.util.Scanner;

public class Fibbinoseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,n1=0,n2=1,i,a;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter num");
		n=obj.nextInt();
		System.out.print(n1+" "+n2);
		for(i=2;i<n;i++)
		{
			
			a=n1+n2;
			System.out.print(" "+a);
			n1=n2;
			n2=a;
			
		}
		
		
	}

}
