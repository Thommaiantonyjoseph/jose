package Com.java.payilagam;

public class Overriding {

	
	
		//obj.eat();
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("i am eating");
		}
		public void abc(){
			System.out.println("welcome");
		}
	}
	
class eat extends Overriding{

	
  public  void eat(){
	System.out.println("hi");
	super.eat();
}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding obj=new eat();
        obj.eat();
		obj.abc();
			
  }
}
