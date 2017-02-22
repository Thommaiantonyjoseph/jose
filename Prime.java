package Com.Java;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args){
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter your num1 ");
		int n1=obj.nextInt();
		System.out.println("Enter your num2 ");
		int n2=obj.nextInt();
		int cunt = 0;
		for(int i=n2;i<=n1;i++){
			
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					
					cunt=0;
					break;
				}
				
				else{
					
					
					cunt=1;
					
				}
				
				
			}
			if(cunt==1){
				
				System.out.println(i);
				
			}
			
		}
			
		
		
	}
}
