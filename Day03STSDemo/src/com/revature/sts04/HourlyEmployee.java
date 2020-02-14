package com.revature.sts04;


public class HourlyEmployee extends Employee implements CalculateBiWeeklyPayInterface {
	
	

	private double hoursWorked;

	private double hourlyPay;

	public final String typeOfEmployee = "Hourly";

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public void calculate() {

		double biWeeklyPay = Math.round((this.getHoursWorked() * this.getHourlyPay()*100)/100);
		System.out.println("Employee:" + this.getName());
		System.out.println("Type of Employee: " + typeOfEmployee);
		System.out.println("Bi-Weekly pay with pay of $" + Math.round(this.getHourlyPay()*100.00/100.00) + "/hr at " +this.getHoursWorked()+" hours this period is: $"+ biWeeklyPay);

	}

}


