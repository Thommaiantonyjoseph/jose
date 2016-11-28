package Com.Payilagam.Java;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int reverse=0;
Scanner in =new Scanner (System.in);
System.out.println("Enter your digit");
int digit=in.nextInt();
	
for(a=digit;a>0;a=a/10){

	reverse=reverse+a%10;
}
System.out.println("sum of digit"+reverse);
}}
