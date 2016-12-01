package Com.Payilagam.Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,f = 0;
		Scanner in =new Scanner(System.in);
		System.out.println(" Enter your number");
		a=in.nextInt();
for (int i=1;i<=a;i++){
	
	if(a%i==0){
		f++;
	}}
	if(f<=2){
		System.out.println("Prime Number");
	}
	else{
		System.out.println("NOT prime");
	}
	
	
}
	}


