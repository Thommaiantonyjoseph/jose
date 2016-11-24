package Nov9;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int select;
      int b;
      while(select==1){
      int a ;
     
      float result;
      Scanner joseph=new Scanner(System.in);
      System.out.println("1.Addition");
      System.out.println("2.Subraction");
      System.out.println("3.Multiply");
      System.out.println("4.division");
      System.out.println(" Enter your choice=");
      int choice=joseph.nextInt();
      System.out.println("Enter a value");
      a=joseph.nextInt();
      System.out.println("Enter b value");
      b=joseph.nextInt();
      
      if(choice==1){
    	  float add=a+b;
    	  System.out.println("1.Addition Value is ="+add);
      }
      else if (choice==2){
      float sub=a-b;
      System.out.println("2.Subraction Value is="+sub);
    	  
      }
      else if(choice==3){
    	 float mul=a*b;
    	 System.out.println("3.Multiply Value is="+mul);
      }
      else if (choice==4){
    	  float div=a/b;
    	  System.out.println("4.Division Value is "+div);
      }
      System.out.println("Do you want  continue");
      System.out.println("1.Yes,2.No");
     select  =joseph.nextInt();
	}
      }
	}








