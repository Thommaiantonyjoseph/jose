package Com.Payilagam.Java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
System.out.println("Please Enter Number ");
int n=in.nextInt();
int fact =1;
for(int i=n;i>0;i--){
	fact =fact*i;
}
System.out.println("FACTORIAL value is "+fact);
	}

}
