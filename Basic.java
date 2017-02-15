package Com.Java;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter your month:  ");
		int c=obj.nextInt();
	int count=0;
		System.out.println("Enter your day:  ");
		int d=obj.nextInt();
		int []a={31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<c-1;i++)
		 count = count +a[i];
		System.out.println(" days:"+(count+d));
		}
}
					
	
	

	
	
