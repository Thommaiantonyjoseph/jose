package Nov9;

import java.util.Scanner;

public class NumberOfStudentsMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	NumberOfStudentsMark in=new NumberOfStudentsMark();
	


int student=0;    
while(student<5){
	int subject=0;
         String studentsnames;
         Scanner jose=new Scanner(System.in);
         student=student+1;
         subject=subject+1;
        System.out.println("Enter student names=" );
        String studentsnames1=jose.nextLine();
        
       
      System.out.println("enter mark=");
       int Mark1=jose.nextInt();
       int Mark2=jose.nextInt();
       int Mark3=jose.nextInt();
       int Mark4=jose.nextInt();
       int Mark5=jose.nextInt();
    int total= in.add(Mark1,Mark2,Mark3,Mark4,Mark5);
   float avg= in.avg(total);
  
  
    System.out.println("Total is="+ in.add(Mark1,Mark2,Mark3,Mark4,Mark5));
    System.out.println("avg is="+in.avg(total));
     } 
	}

	private float avg(int total) {
		// TODO Auto-generated method stub
		float avg=(total)/5;
		return avg;
	}

	private int add(int a,int b,int c,int d,int e) {
		
		// TODO Auto-generated method stub
		int total=(a+b+c+d+e);
		return total;
	}

}
