package com.revature.sts05;

public class PersonInstantiator {
	public static void main(String[] args) {
		Person bub = new Person("Robert", 21);
		Person blob = new Person();
		
		blob.setName("Blobert");
		
		System.out.println("We've got Blob:"+blob.getName());

		System.out.println("We've got Bub:"+bub.getName());
		
				
	}

}
