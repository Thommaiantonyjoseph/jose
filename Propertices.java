package Com.Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertices {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties p=new Properties();
FileInputStream f1= new FileInputStream("E://java//joseph//Thommai//src//Com//Java//joseph");

p.load(f1);

System.out.println(p.getProperty("Username"));
System.out.println(p.getProperty("Password"));

	}

}
