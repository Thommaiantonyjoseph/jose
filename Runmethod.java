package Com.Java;

public class Runmethod  extends Thread {
	
	
	public void run() {
		// TODO Auto-generated method stub
   System.out.println("i  am running....");
	}
	public static void main(String[] args) {
		
		
		Runmethod obj=new Runmethod();
		obj.run();
		
	}

}
