package com.revature.sts05;
import java.util.Scanner;


public class ScannerInput {
	public static void main(String[] args) {
		
	//name age gender mobile number salary
		Scanner read = new Scanner(System.in);
		String name;
		int age;
		int mobileNumber;
		String gender;
		double salary;
		boolean loop=true;
		String response;
		while(loop) {
					System.out.println("Enter Name: ");
					name= read.nextLine();
					System.out.println("Enter Age: ");
					age = read.nextByte();
					System.out.println("Enter Mobile #: ");
					mobileNumber= read.nextInt();
					System.out.println("Enter Gender: ");
					gender=read.next();
					System.out.println("Enter Salary: ");
					salary= read.nextDouble();
					
					System.out.println("Hey "+name+", is all of this correct?");
					System.out.println("Name: "+name);
					System.out.println("Mobile #: "+mobileNumber);
					System.out.println("Gender: "+gender);
					System.out.println("Age: "+age);
					System.out.println("Salary: "+salary);
					System.out.println("");
					
					System.out.println("Is this all correct? [y/n]");
					response = read.next();
					if(response.equalsIgnoreCase("n")) {
						break;
					}
					else {
						System.out.println("Great!");
					
					}
					

			
		}
		
		
	}
}
