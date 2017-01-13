package Com.java.payilagam;

import java.util.Scanner;

public class Namecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Enter your name ");
String str=obj.nextLine();
char[]a={'a','e','i','o','u'};
int []a1=new int[5];
for(int i=0;i<str.length();i++){
	char name=str.charAt(i);
	
	for(int j=0;j<a.length;j++)
	{
		if(a[j]==name)
			a1[j]++;
			
	}

	
	
}

for(int k=0;k<a.length;k++){
	
System.out.println(a[k]+"="+a1[k]);
	
}
	}

}
