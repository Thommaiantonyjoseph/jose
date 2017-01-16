package Com.Java;

import java.util.Scanner;

public class Print1to10withoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Print1to10withoutloop in=new Print1to10withoutloop();
		 
		  in.add(1);
		}

	private void add(int i) {
		// TODO Auto-generated method stub
		
		
		System.out.println(i);
		if(i<10){
			
			add(i+1);
		}
   }	
	
}
