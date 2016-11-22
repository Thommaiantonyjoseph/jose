package Nov9;

import java.util.Scanner;

public class MyFirstJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
     Scanner in =new Scanner(System.in);
       System.out.print("Enter the maths value = "); 
   int maths=in.nextInt();
   System.out.print("Enter the scince value = ");
   int scince=in.nextInt();
   MyFirstJava mark = new MyFirstJava();
   mark.add(maths,scince);
  mark.persentage(maths,scince);
    
	}

	private void persentage(int m1,int m2) {
		float pre = (m1 + m2)/2  ;
		System.out.println("Persentage % =" + pre);
		
	}

	private void add(int m1, int m2) {
		int total = m1 + m2;
		System.out.println("Total mark =" +total);
		
	}

}
