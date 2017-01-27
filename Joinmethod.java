package Com.Java;

public class Joinmethod extends Thread {

	public void run (){
		
		for (int i=1;i<5;i++){
			
			try{
				
				Thread.sleep(5000);
				
				
			}
			catch (Exception e){
				
				System.out.println(e);
			}
			System.out.println(i);
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		Joinmethod obj1=new Joinmethod();
		Joinmethod obj2=new Joinmethod();
		Joinmethod obj3=new Joinmethod();
		obj1.start();
		try{
			
		obj1.join();	
			
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		obj2.start();
		obj3.start();
	}
	
	
}
