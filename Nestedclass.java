package Com.java.payilagam;

public class Nestedclass {
	static int a =8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nestedclass obj =new Nestedclass();
		//obj.sub();
		//A in=new A();
		//in.add();
		
	}
	
	
	void sub (){
		
		System.out.println("i am outer class");
		
	}
	static class A{
		
		void add(){
			
			//int a=3;
			int b=4;
			System.out.println("i am static nested class"+(a+b));
			
		}
		public static void main(String[] args){
			
			A in=new A();
			in.add();
			Nestedclass obj =new Nestedclass();
			obj.sub();
		}
		
		
	}

}
