package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This is a generic method to fetch the date and time in specefic format
	 * 
	 * 
	 * */
	public String getCalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d= cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value= sdf.format(d);
		return value;
	}


	/**
	 * This is a generic method to get a random number
	 * 
	 * 
	 * */
	public int getRandomNumber(){
		Random r= new Random();
		int num=r.nextInt(1000);
		return num;

	}
}
