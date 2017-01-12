package Com.java.payilagam;

public class Inheritance {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	
public	void add(int a,int b){
		System.out.println(a+b);
	}
	public void sub(int a,int b){
		System.out.println(a-b);
	}
	

}
 class Jose extends Inheritance{
	public  void mul(int a,int b){
		 System.out.println(a*b);
	 }
	public  void div (int a,int b){
		 System.out.println(a/b);
	 }
	 public static void main(String[] args){
		 int a=20; int b=30;
		Jose obj=new Jose(); 
		 obj.add(a, b);
		 obj.div(a, b);
		 obj.mul(a, b);
		 obj.sub(a, b);
	 }
	 
	
}
