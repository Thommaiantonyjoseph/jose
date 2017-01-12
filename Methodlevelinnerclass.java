package Com.java.payilagam;

public class Methodlevelinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Methodlevelinnerclass in=new  Methodlevelinnerclass();
		 in.method();
	}
	void method(){
		System.out.println("i am method ");
		
		class Out{
				void morning(){
				System.out.println("good morning");
			}
		}
			Out in =new Out();
			in.morning();
			
	}

}
