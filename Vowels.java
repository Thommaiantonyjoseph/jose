package Com.Payilagam.Java;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
System.out.print("Enter Name:");
String str=in.nextLine();
for (int i=0;i<str.length();i++){
	char vowel=str.charAt(i);
	if(     (vowel=='a')||
			(vowel=='e')||
			(vowel=='i')||
			(vowel=='o')||
			(vowel=='u')){
		System.out.println(vowel);
	}
	   if( (vowel == 'A')||
   	        (vowel == 'E')||
   	        (vowel == 'I')||
   	        (vowel == 'O')||
   	        (vowel == 'U')){
	    System.out.println(vowel);
	   }	
}
	}

}
