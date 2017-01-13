package Com.java.payilagam;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj =new Scanner(System.in);
System.out.println("Enter your count");
int a=obj.nextInt();
int []array=new int[a];
array[0]=0;
array[1]=1;
for(int i=2;i<a;i++){
	array[i]=array[i-1]+array[i-2];
	
	
	//System.out.print(array[i]+" ");
}
for (int j=0;j<a;j++){
	
	System.out.print(array[j]+" ");
}

	}

}
