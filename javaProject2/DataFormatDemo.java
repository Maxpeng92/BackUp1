package javaProject2;

import java.text.*;
import java.util.Date;

public class DataFormatDemo {

	public static void main(String[] args) {
		SimpleDateFormat sp1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sp2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		try
		{
			Date d = sp1.parse("2016-01-27 18:33:59");
			System.out.println(d);
			System.out.println(sp2.format(d));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}

}
