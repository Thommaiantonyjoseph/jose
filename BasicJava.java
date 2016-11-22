package Nov9;

import java.util.Scanner;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BasicJava in =new BasicJava();
     Scanner joe =new Scanner(System.in);
     int Num1,Num2;
     System.out.println("Enter Num1=");
     Num1=joe.nextInt();
     System.out.println("Enter Num2=");
     Num2=joe.nextInt();
     in.add(Num1,Num2);
     System.out.println("Total is:"+ in.add(Num1,Num2));
     
	}

	private int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int Total=num1+num2;
		//System.out.println("Total is:="+Total);
		return Total;
	}

}
