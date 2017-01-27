package Com.Java;

public class Setnameid extends Thread {
	
	
	public void run(){
		System.out.println("i am runing");
	}
	public static void main(String[] args) {
		Setnameid obj1=new Setnameid();
		Setnameid obj2=new Setnameid();
		System.out.println("name of 1:"+obj1.getName());
		System.out.println("name of 1:"+obj2.getName());
		System.out.println("id of 1:"+obj1.getId());
		obj1.start();
		obj2.start();
		obj1.setName("joseph");
		System.out.println("ofter name of 1:"+obj1.getName());
	}

}
