package Com.Java;

import java.util.Scanner;

public class Squrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1;i<=100;i++){
	
	for(int j=1;j<=100;j++){
		
	double	res=Math.pow(i, 2)+Math.pow(j, 2);
	res= Math.sqrt(res);
	double a=Math.floor(res);
	if(res-a==0){
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(res);
	}
	}
}
	}

}
