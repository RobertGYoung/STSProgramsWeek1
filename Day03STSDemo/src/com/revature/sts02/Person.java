package com.revature.sts02;

public abstract class Person {
		 int age;
		 String name;
		 
		 public Person() {
			 
		 }
		 
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	 void input(String name, int age){
			 this.age=age;
			 this.name=name;
			 
		 }
	 void display() {
		 System.out.println("Name: "+name+" Age: "+age);
		 
	 }
	 
	 public abstract String doSomething();
		
	
	
}
