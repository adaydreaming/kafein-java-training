package com.kafein.javacourse.chapters.conditions;

import java.util.Date;

public class SwitchCase {

	public static void main (String[] args) {
		String day = null;
		int dayValue = new Date().getDay();
		switch (dayValue) {
		  case 0:
		    day = "Sunday";
		    break;
		  case 1:
		    day = "Monday";
		    break;
		  case 2:
		     day = "Tuesday";
		    break;
		  case 3:
		    day = "Wednesday";
		    break;
		  case 4:
		    day = "Thursday";
		    break;
		  case 5:
		    day = "Friday";
		    break;
		  case 6:
		    day = "Saturday";
		}
		
		System.out.print("To day is " + day);
	
	}
}
