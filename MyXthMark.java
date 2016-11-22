package Nov9;

import java.util.Scanner;

public class MyXthMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyXthMark in=new  MyXthMark();
     Scanner joseph =new Scanner(System.in);
     int tamil,english,maths,science,scoial;
     System.out.print("Enter tamil marks=");
     tamil=joseph.nextInt();
     System.out.print("Enter english marks=");
     english=joseph.nextInt();
     System.out.print("Enter maths marks=");
     maths=joseph.nextInt();
     System.out.print("Enter science marks=");
     science =joseph.nextInt();
     System.out.print("Enter scoial marks=");
     scoial=joseph.nextInt();
     int Total=in.add( tamil,english,maths,science,scoial);
     int avgtotal= in.avg( Total);
     System.out.println("10th Mark main Total is=:"+ in.add( tamil,english,maths,science,scoial));
     System.out.println("10th Mark avg main is="+ in.avg( Total));
     if(avgtotal>60){
			System.out.println("first class");
			
		}
		else if(avgtotal<50){
			System.out.println("pass");
		}
		else{
			System.out.println("RA");	
		}	
		
	}
	private int add( int tamil,int english,int maths,int science,int scoial){
		int total= (tamil+english+maths+science+scoial);
		return total;
	}

	private int avg( int Total){
		int avgtotal=(Total)/5;
			
		
		return avgtotal;
		
		
		
	
	}
	
		}
		
	

