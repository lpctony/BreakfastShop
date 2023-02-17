package Dao;

import java.util.Calendar;

public class DateTimer { 
	   
	 public static String getTime() { 
	  Calendar calendar = Calendar.getInstance(); 
	  int year = calendar.get(Calendar.YEAR); 
	  int month = calendar.get(Calendar.MONTH) + 1; 
	  int day = calendar.get(Calendar.DATE); 
	  int hour = calendar.get(Calendar.HOUR_OF_DAY); 
	  int minute = calendar.get(Calendar.MINUTE); 
	  int second = calendar.get(Calendar.SECOND); 
	  return (year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day) + " " 
	    + String.format("%02d", hour) + "." + String.format("%02d", minute) + "." + 
	    String.format("%02d", second)); 
	 } 
	  
	} 
	 
	 
	 
	 
	