package com.revature.sts04;

public class SalaryEmployee extends Employee implements CalculateBiWeeklyPayInterface {

	public double salary;

	public final String typeOfEmployee = "Salary";

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void calculate() {

		double biWeeklyPay = Math.floor(((this.getSalary() / 26)*100.00)/100.00);

	

		System.out.println("Employee:" + this.getName());
		System.out.println("Type of Employee: " + typeOfEmployee);
		System.out.println("Bi-Weekly pay with pay of: " + this.getSalary() + "/yr is " + biWeeklyPay);

	}

}
