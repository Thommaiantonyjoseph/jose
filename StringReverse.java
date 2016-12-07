package Com.Payilagam.Java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
System.out.println("Enter reverse name :");
String str=in.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
	char name=str.charAt(i);
	System.out.print(name);
	
	}
	}

}
