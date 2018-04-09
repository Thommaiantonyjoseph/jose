package com.java.joe;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter Number");
		int num=obj.nextInt();
		int sum=0,a,b,ans=0;;
		while(num>0){
			a=num%10;
			sum=sum+a;
			num=num/10;
			
		}	
		while(sum>0){
			
			b=sum%10;
			ans=ans+b;
			sum=sum/10;
		}
		
	System.out.println(ans);
		
	}

}
