package Com.Java;

public class Multithread extends Thread {

	
	
	public void run (){
		
		
		
		System.out.println("i am runing");
	}
	public static void main(String[] args) {
		Multithread obj=new  Multithread();
		obj.start();
	}
}
