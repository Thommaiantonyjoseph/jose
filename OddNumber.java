package Com.Payilagam.Java;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
Scanner in =new Scanner(System.in);
System.out.println("Enter your Number");
a=in.nextInt();

b=a%2;

if(b==1){
	System.out.println("ODD Number");
}
else{
	System.out.println("EVEN Number");
}

	}

}
