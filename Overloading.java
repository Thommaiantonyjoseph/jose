package Com.java.payilagam;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading();
		obj.display('a');
		obj.display('a',10);
	}

	private void display(char c, int i) {
		// TODO Auto-generated method stub
		System.out.println(c+" "+i);
	}

	private void display(char c) {
		// TODO Auto-generated method stub
		System.out.println(c);
	}

}
