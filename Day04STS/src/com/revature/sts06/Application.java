package com.revature.sts06;

public class Application {
	public static void main(String[] args) {
		
		Person p1 = new Person("Rob",21);
		Person p2 = new Person("Rob",2);
		
		System.out.println("P1: "+p1.getName()+" Age: "+p1.getId()+"\nP2: "+p2.getName()+" Age: "+p2.getId());
		System.out.println(p1);

		if(p1.equals(p2)) {
			System.out.println("They equal eachother");
		}
		else
			System.out.println("They are not equal");
	
	}
}
