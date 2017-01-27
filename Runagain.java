package Com.Java;

public class Runagain extends Thread {

	
	public void run(){
		
		for (int i=1;i<5;i++){
			
			System.out.println(i);
			
			
		}
		
	}
	public static void main(String[] args) {
		Runagain obj=new Runagain();
		Runagain obj1=new Runagain();
		
		obj.run();
		obj1.run();
	}
	
}
