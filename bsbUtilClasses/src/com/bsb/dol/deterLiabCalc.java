package com.bsb.dol;

import java.util.GregorianCalendar;


public class deterLiabCalc {
	
	public static void main (String [] args){
		
		GregorianCalendar date = new GregorianCalendar();		
		date.set(2013, 4, 28);
		
		calcLiab(4, 2014);
		calcLiab(4, 2013, date);
	}

	private static void calcLiab(int qtr , int yr) {
				
		if (qtr == 4) {
			qtr = 1;
			yr += 1;
		}
		else {
			qtr += 1;
		}
		
		System.out.println("Beginning quarter = " + qtr);
		System.out.println("Beginning year = " + yr);
		
	}
	
	private static void calcLiab(int qtr , int yr , GregorianCalendar firstEmpDate){
		
		
		// @SuppressWarnings("deprecation")
		String empYr = firstEmpDate.getTime().toString();
		
		if (qtr == 4) {
			qtr = 1;
			yr += 1;
		}
		else {
			qtr += 1;
		}
		
//		if (yr >= empYr){
//			
//			System.out.println("test great than empYr");
//		}
		
		System.out.println("Beginning quarter = " + qtr);
		System.out.println("Beginning year = " + yr);
		System.out.println("First employed year = " + empYr);
		
	}
	
	
	
	
	
	
	
	
	

}
