package com.revature.sts04;

import java.util.Scanner;

public class EmployeeManagmentSystem {
	public static void main(String[] args) {
//
//		HourlyEmployee he1 = new HourlyEmployee();
//		SalaryEmployee se1 = new SalaryEmployee();
//
//		he1.setName("john");
//		he1.setHourlyPay(15.0);
//		he1.setHoursWorked(80);
//
//		se1.setName("Jiil");
//		se1.setSalary(55000.00);
//
//		he1.calculate();
//		se1.calculate();
		
		
		Scanner scannerObj = new Scanner(System.in);
		
		
		String nameInput;
		String typeInput;
		double salaryInput;
		double hourlyInput;
		double hoursInput;
		
		System.out.println("What is your name?");
		nameInput= scannerObj.nextLine();
		
		
		System.out.println("What type of empolyee are you?");
		typeInput= scannerObj.nextLine();
		
	
		
		
		
		switch(typeInput) {

		case "Hourly": 
			HourlyEmployee newHourlyEmployee = new HourlyEmployee();
			newHourlyEmployee.setName(nameInput);
			
			System.out.println("How much are you paid hourly, "+newHourlyEmployee.getName()+"?");
			hourlyInput=Double.parseDouble(scannerObj.nextLine());
			newHourlyEmployee.setHourlyPay(hourlyInput);

			System.out.println("How many hours did you work these last two weeks, "+newHourlyEmployee.getName()+"?");
			hoursInput=Double.parseDouble(scannerObj.nextLine());
			newHourlyEmployee.setHoursWorked(hoursInput);
			newHourlyEmployee.calculate();
			break;
		default: 
		case "Salary":
			SalaryEmployee newSalaryEmployee = new SalaryEmployee();
			newSalaryEmployee.setName(nameInput);
			
			System.out.println("How much are you paid yearly, "+newSalaryEmployee.getName()+"?");
			salaryInput =   Double.parseDouble(scannerObj.nextLine());
			newSalaryEmployee.setSalary(salaryInput);
			newSalaryEmployee.calculate();
			break;
		}
		
	scannerObj.close();    

		
		
		
		
		
		
		
		
		
		
		

	}
}
