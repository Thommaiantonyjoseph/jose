package Com.java.payilagam;

public class Singleinheritance {

	
	void add(){
		System.out.println("i am adding");
	}

}
class Antony  extends Singleinheritance {
	
	
	void morning (){
		System.out.println("good morning");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Antony obj =new  Antony();
		obj.add();
		obj.morning();
		
	}
	
}
