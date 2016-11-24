package Nov9;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int b;
		 int select; 
		 do{
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
	      switch(choice){
	      case 1:
	    	  float add=a+b;
	    	  System.out.println("1.Addition Value is="+add);
	    	  break;
	      case 2:
	    	  float sub=a-b;
	    	  System.out.println("2.Subraction Value is="+sub);
	    	  break;
	      case 3:
	    	  float mul=a*b;
	    	  System.out.println("3.Multiply is="+mul);
	    	  break;
	      case 4:
	    	  float div=a+b;
	    	  System.out.println("4.division Value is="+div);
	    	  break;
	    	  
	    	  
	      }
	      System.out.println("Do you want  continue");
	      System.out.println("1.Yes,2.No");
	     select =joseph.nextInt();
	}while(select==1); 
	} 
	      
	      
	}


