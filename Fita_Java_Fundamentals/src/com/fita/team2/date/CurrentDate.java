package com.fita.team2.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDate {

	public static void main(String[] args) {
		
		DateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long dateval = System.currentTimeMillis();
		Date d = new Date(dateval);
		String currtime = sim.format(d);

		System.out.println("Date Format Value :" + currtime);
		sim.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("Date Value :" + d);
		System.out.println("American TimeZone Value :" + sim.format(d));

	}

}
