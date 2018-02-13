package com.psl.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateDemo1 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		// System.out.println(d); // displays system date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);

		// System.out.println(sdf.format(d));

		String str = new String("23/10/2017");
		String str1 = new String("12/12/2010");
		sdf.setLenient(false);
		try {
			d1 = sdf.parse(str);
			d2 = sdf.parse(str1);

			// System.out.println(m);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);

		// System.out.println(c2.getTime());
		int leap = 0;
		int diff = Math.abs((c1.get(c1.YEAR) - c2.get(c2.YEAR)));
		// System.out.println(diff);
		for (int i = c1.get(c1.YEAR); i <= c2.get(c2.YEAR); i++) {

			if (i % 4 == 0)
				leap++;
		}
		// System.out.println(leap);
		System.out.println(c1.get(c1.DAY_OF_YEAR));
		System.out.println(c2.get(c2.DAY_OF_YEAR));
		System.out.println((diff - leap));
		int count = leap * 366 + (diff - leap) * 365
				+ Math.abs(c1.get(c1.DAY_OF_YEAR) - c2.get(c2.DAY_OF_YEAR));
		System.out.println("The number of days are:" + count);
		
		
	}

}
