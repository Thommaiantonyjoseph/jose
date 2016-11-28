package basics;

import java.util.Scanner;

public class Revarse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int reverse=0;
Scanner joseph=new Scanner(System.in);
System.out.println("Enter reverse value");
a=joseph.nextInt();
while(a!=0){
	reverse=reverse*10;
	//System.out.println(reverse);
	reverse=reverse+a%10;
	//System.out.println(reverse);
	a=a/10;
	//System.out.println(a);
	//reverse=a+reverse;
}
	System.out.println("reverse of entered number is"+reverse);
///System.out.println(a);
}
	}


