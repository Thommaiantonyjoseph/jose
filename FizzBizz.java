package Com.Java;

import java.util.Scanner;

public class FizzBizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Enter your value");
int n=obj.nextInt();
for(int i=1;i<=n;i++){
	
	if(i%3==0 && i%5==0){
		
		System.out.println("FizzBuzz");
	}
		else if (i%3==0){
		System.out.println("Fizz");
		}
		else if (i%5==0){
			System.out.println("Buzz");
		}
		else
		{
			System.out.println(i);
		}
	}
	
	
	

	}

}
