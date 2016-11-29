package Com.Payilagam.Java;

import java.util.Scanner;

public class SumOfDigitUsedWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int sum=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter your number");
a=in.nextInt();
while(a>0){
	sum=sum+a%10;
	a=a/10;
	
}
System.out.println(" sum of digit"+sum);
	}

}
