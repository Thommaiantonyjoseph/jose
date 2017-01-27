package Com.Java;

public class ThreadstateEx extends Thread {
	
	
	public void run (){
		
		System.out.println("i am running");
		
	}
	public static void main(String[] args) {
		
		ThreadstateEx obj=new ThreadstateEx();
		//ThreadstateEx obj1=new ThreadstateEx();
		obj.start();
		obj.start();
	}

}
