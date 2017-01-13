package Com.java.payilagam;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
System.out.println("Enter your word");
String s=obj.nextLine();
String s2="";
for(int i=s.length()-1;i>=0;i--){

	char name=s.charAt(i);
	//System.out.println(name);
	s2=s2+name;
	
}
System.out.println(s2);
if(s.equals(s2)){
	System.out.println("Both are equal");
}
else {
	System.out.println("Both are not equal");
}
	}

}
