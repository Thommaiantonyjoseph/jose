package com.java.joe;

import java.util.Scanner;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
      Scanner obj=new Scanner(System.in);
      System.out.println("enter num");
      int num=obj.nextInt();
      int a[]=new int[num];
      System.out.println("Enter sort value");
      for(int i=0;i<a.length;i++){
    	  a[i]=obj.nextInt();
    	  
      }
      
      for(int j=0;j<a.length;j++){
    	  
    	   for(int k=1;k<a.length-j;k++){
    		    if(a[k-1]>a[k]){
    		    	temp=a[k-1];
    		    	a[k-1]=a[k];
    		    	a[k]=temp;
    		    }
    		   
    	   }
      }
    	   for(int i=0;i<a.length;i++){
    		   
    		   System.out.println(a[i]);
    	   }
      
	}

}
