package com.psl.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		Date m = new Date();
		System.out.println(d); // displays system date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);

		System.out.println(" SDF" + sdf.format(d));

		String str = new String("08/11/2017");

		sdf.setLenient(false);
		try {
			m = sdf.parse(str);
			System.out.println(m);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar c = Calendar.getInstance();
		Calendar c1 = new GregorianCalendar(); // OR

		c.setTime(m);
		System.out.println("Calender " + c.DATE);

		System.out.println(c.get(c.DAY_OF_YEAR));
		c.set(c.DAY_OF_MONTH, 22);
		System.out.println(c.get(c.DAY_OF_MONTH));
		java.util.Date d2 = c.getTime();
		java.sql.Date sqld = new java.sql.Date(d2.getTime());
		System.out.println(sqld);

		Date dd = new Date();

	}

}
