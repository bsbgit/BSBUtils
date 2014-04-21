package com.bsb.validators;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AgeValidator {

	public static void ageValidator (Calendar dob, String cc, String name) {
				
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		// System.out.println(sdf.format(calendar.getTime()));
		
		Calendar calendar = new GregorianCalendar();
		
		final int US_DRINKING_AGE = 21;
		final int UK_DRINKING_AGE = 18;
		
		int year = calendar.get(Calendar.YEAR); 
		int dobyr = dob.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dobmonth = dob.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int dobday = dob.get(Calendar.DAY_OF_MONTH);
	
		if (dobmonth == 1 && dobday == 29){
			System.out.println("Holy Shit! It's a Leap Year!!");
		}
		
		if (cc == "US") {
			
			System.out.println("Hello " + name + " my fellow American!!");
			System.out.println("The drinking age is: " + US_DRINKING_AGE);
			
			if (year-dobyr > US_DRINKING_AGE) {
				System.out.println("You're legal old man!");
			}
			else if (year-dobyr == US_DRINKING_AGE) {
				if (month > dobmonth){
					System.out.println("You are of age!!");
				}
				else if (month == dobmonth){
					if(day >= dobday){
						System.out.println("You are of age!!");
					}				
					else {
						System.out.println("Not quite " + US_DRINKING_AGE + ". This month though!");
					}
				}
				else {
					System.out.println("Fail, You're not legal! " + dobyr + " is the year though!");
				}
			}
			else {
				System.out.println("Fail, You're not legal!!");
			}
		}
		
		else if (cc == "UK") {
			
			System.out.println(name +" You Dirty Brit!!");
			System.out.println("The drinking age is: " + UK_DRINKING_AGE);
			
			if (year-dobyr > UK_DRINKING_AGE) {
				System.out.println("You're legal old man!");
			}
			else if (year-dobyr == UK_DRINKING_AGE) {
				if (month > dobmonth){
					System.out.println("You are of age!!");
				}
				else if (month == dobmonth){
					if(day >= dobday){
						System.out.println("You are of age!!");
					}				
					else {
						System.out.println("Not quite " + UK_DRINKING_AGE + ". This month though!");
					}
				}
				else {
					System.out.println("Fail, You're not legal! " + dobyr + " is the year though!");
				}
			}
			else {
				System.out.println("Fail, You're not legal!!");
			}
		}
		
		else {
			
			System.out.println("I'm sorry " + name + ". We cannot currently validate for your country.");			
		}
		
		if (dobmonth == month && dobday == day){
			System.out.println("Happy Birthday!!");
		}			
		

	/*	int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
	 
		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);    */
	 
	/*	System.out.println("year \t\t: " + year);
		System.out.println("year \t\t: " + dobyr);
		System.out.println("dobmonth \t\t: " + dobmonth);
		System.out.println("dobday \t\t: " + dobday);
		
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
	 
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);    */
		
	}
	
}
