package Com.java.payilagam;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

add( );

	}

	private static void add() {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		System.out.println("Enter A ");
		int a=in.nextInt();
		System.out.println("Enter B ");
		int b=in.nextInt();
		int c = 0;
		try {
		    c=a/b;
		 }
		catch(ArithmeticException e){
			System.out.println("please check the value");
			
			
		}
		finally {
			System.out.println(c);
			add();
		}
	}

	

}
