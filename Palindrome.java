package Com.Payilagam.Java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in =new Scanner(System.in);	
	System.out.println("Enter your number");
	int n=in.nextInt();
	int a,reverse=0,s,t=n;
	while(n>0){
		a=n%10;
		n=n/10;
		reverse=reverse*10+a;
		}
	if(t==reverse){
		System.out.println("PALINDROME");
	}
	else {
		System.out.println("Not Palindrome");
	}
	}
	}


