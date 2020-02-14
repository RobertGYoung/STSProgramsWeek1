package com.revature.sts04;

public class SwitchCaseForDay {
	
	public static void main(String[] args) {
		
		String day = args[0];
		
		switch(day) {
		case "Sun": 
			System.out.println("Sunday");
			break;
		
		case "Mon": 
			System.out.println("Monday");
			break;
		case "Tue": 
			System.out.println("Tuesday");
			break;
		case "Wed": 
			System.out.println("Wednesday");
			break;
		case "Thu": 
			System.out.println("Thursday");
			break;
		case "Fri": 
			System.out.println("Friday");
			break;
		case "Sat": 
			System.out.println("Saturday");
			break;
		default:System.out.println("Holiday");
		
			
		
		}
		
		
	}
	
	
}
