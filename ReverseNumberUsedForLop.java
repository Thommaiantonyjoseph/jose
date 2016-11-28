package Com.Payilagam.Java;

import java.util.Scanner;

public class ReverseNumberUsedForLop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int reverse=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter your reverse Number");
int number=in.nextInt();
for(a=number;a>0;a=a/10){
	reverse=reverse*10;
	reverse=reverse+a%10;
}
System.out.println("your reverse number"+reverse);
	}

}
