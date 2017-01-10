package Com.java.payilagam;

public class NormalInnerclass {

	
	int  i=10;
	public static void main(String[] args) {
		NormalInnerclass in=new NormalInnerclass();
		NormalInnerclass.	A obj= in.new A();
		obj.add();
		}
	class A{
		
		
		
		void add(){
			System.out.println("hi wellcome");
			int a=5,b=4,c;
			c=a+b;
			System.out.println(c);
		}

	}

}
