package Com.Java;

import java.nio.charset.MalformedInputException;

public class SleepThread extends Thread {
	
	
	public void run (){
		for (int i=1;i<5;i++){
			
		
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
			System.out.println(i);
			
		
		
		
		}

		
	}
	public static void main(String[] args) {
		SleepThread obj=new SleepThread();
		SleepThread obj2=new SleepThread();
		obj.start();
		//obj2.start();
	}

}
