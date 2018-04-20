package com.java.joe;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4,7,6,1,2,12,11,8,9,10,3,5};
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int temp=0;
	int	num=a.length-1;
		for(int i=0;i<num;i++){
			
			if(a[i]==n)
			{
				temp=a[i];
				a[i]=a[num];
				a[num]=temp;
				
			}
			
			
		}
		for(int j=0;j<num+1;j++){
			
			System.out.println(a[j]);
		}

	}

}
