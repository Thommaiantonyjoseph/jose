package Com.Java;

import java.util.Calendar;

public class Printbeforedate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Calendar cal =Calendar.getInstance();
  
  cal.add(Calendar.DATE,-1);
  System.out.println(cal.getTime());
	}

}
