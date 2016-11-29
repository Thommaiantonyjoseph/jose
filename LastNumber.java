package Com.Payilagam.Java;

import java.util.Scanner;

public class LastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int reverse=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter your number");
a=in.nextInt();
reverse=a%10;
a=a/10;
System.out.print(reverse);
System.out.print(a);

	}

}
