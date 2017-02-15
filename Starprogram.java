package Com.Java;

import java.util.Scanner;

public class Starprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("enter limits");
int n=obj.nextInt();
int cunt=1;
for(int i=0;i<=n;i++){
	
	for(int j=0;j<cunt;j++){
		
		System.out.print("*");
		
	}
	System.out.println();
	cunt=cunt*2;
}



	}

}
