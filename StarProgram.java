package Com.Payilagam.Java;

public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<6;i++){
			
			for (int j=3;j>i;j--){
				
				System.out.print("* ");
			}
			System.out.println();
				for(int k=3;k<=i;k++){
					
					System.out.print("* ");
				}
				System.out.println();
			
			
		}
	}

}
