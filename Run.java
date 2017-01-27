package Com.Java;

public class Run implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i am runing");
	}
	
	
	public static void main(String[] args) {
		Run obj =new Run();
		Thread in=new Thread (obj);
		in.start();
	}

}
