package com.revature.sts02;

public class PersonManager {

	public static void main(String[] args) {

//		Person person[] = new Person[5];
//		String[] names = { "Rob", "Ezra", "Yong", "Henry", "Vicki" }; // list of names
//		int[] ages = { 21, 23, 35, 22, 24 }; // list of ages  
//		//key is index! 
//
//		for (int i = 0; i < person.length; i++) { // instantiates objects
//			person[i] = new Person();
//			person[i].name = names[i];				//adds from name list, age list and displays
//			person[i].age = ages[i];
//			person[i].display();
//		}
		
		Student student1 = new Student("Robert",21,"Java");
		
		student1.display();
		
		Employee employee1 = new Employee("Bob",21,"Software");
		
		employee1.display();
		
		System.out.println("Calculated Pay: "+employee1.processSalary(5, 45000));
		
		
		

	}
} 
