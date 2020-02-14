package com.revature.sts02;

public class Employee extends Person implements Salary{
	String department;
	
	public Employee(String name, int age, String department) {
		super(name,age);
		this.department = department;
		
	}
	
	public void display() {
		super.display();
		System.out.print("Department: "+department+"\n"+doSomething());
		
	}

		public String doSomething() {
			return "Work in a department";
		}

		@Override
		public double processSalary(int workDays, double salary) {
			// TODO Auto-generated method stub
			double total=0;
			total=(salary/365)*workDays;
			return total;
		}
		
}
