package EmployeeDatabse;

import java.util.Scanner;
public class salaryInputTest {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double salary;
	System.out.print("Salary:");
	salary= Double.parseDouble(input.nextLine());
	
	System.out.println(salary);
}
}
