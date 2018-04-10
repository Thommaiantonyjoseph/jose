package com.java.joe;

import java.util.Scanner;

public class Reversefabinno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter limit");
        int num=obj.nextInt();
        int a[]=new int[num];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<num;i++){
        	
        	a[i]=a[i-2]+a[i-1];
        	
        	
        }
        for(int i=num-1;i>=0;i--){
        	
        	System.out.println(a[i]);
        	
        }
        
	}

}
