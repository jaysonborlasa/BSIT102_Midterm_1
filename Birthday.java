import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
 
public class Birthday {
	public static void main(String[]args)throws Exception{
	
	Date date = new Date();
	Calendar calendar = new GregorianCalendar();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
	
	String input_bday = "26-11-2000";
	Date bday =	sdf.parse(input_bday);
	
	int year = calendar.get(Calendar.YEAR);
	calendar.setTime(bday);
	int byear = calendar.get(Calendar.YEAR);
	
	
	int age = year - byear;
	System.out.print("My age is: " + age);	
		
	}
}
