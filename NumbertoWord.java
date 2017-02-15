package Com.Java;

import java.util.Scanner;

public class NumbertoWord {
	public enum hundreds {OneHundred,TwoHundred,ThreeHundred,FourHundred,FiveHundred,SixHundrend,SevenHundred,Eighthundred,NineHundred}
   public enum tens{twenty,thirty,fourty,fifty,sixty,seventy,eighty,ninety}
   public enum ones{one,two,three,four,five,six,seven,eight,nine}
   public enum denom{thousands,laskhs,crores}
   public enum splnums{ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eigtheen,nineteen}
   public static String text="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the convert number to word value ");
		long n=obj.nextLong();
		int rem=0;
		int i=0;
		
		while(n>0){
			if(i==0){
			rem=(int) (n%1000);
			printtext(rem);
			n=n/1000;
			i++;
			}
			else if(n>0){
				rem=(int) (n%100);
				if(rem>0)
					text=denom.values()[i-1]+" "+text;
				printtext(rem);
				n=n/100;
				i++;
				
			}
			
		}
		if(i>0)
		System.out.println(text);
		else
			System.out.println("Zero");

	}
	private static void printtext(int rem) {
		// TODO Auto-generated method stub
		if(!(rem>9 && rem<19)){
			
			if(rem%10>0)
				getones(rem%10);
			rem=rem/10;
			if(rem%10>0)
				gettens(rem%10);
			rem=rem/10;
			if(rem%10>0)
				gethundred(rem%10);
			rem=rem/10;
		}
			else 
				getsplnums(rem%10);
			
			
		
		
	}
	private static void getsplnums(int j) {
		// TODO Auto-generated method stub
		text=splnums.values()[j]+" "+text;
	}
	private static void gethundred(int j) {
		// TODO Auto-generated method stub
		text=hundreds.values()[j-1]+" "+text;
	}
	private static void gettens(int j) {
		// TODO Auto-generated method stub
		text=tens.values()[j-2]+" "+text;
	}
	private static void getones(int j) {
		// TODO Auto-generated method stub
		text=ones.values()[j-1]+" "+text;
	}

}
