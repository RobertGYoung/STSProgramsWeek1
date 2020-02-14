package com.revature.sts03;

public class Manager {
	
	public static void main(String[] args) {
		
	//	PrivatePerson pp1 = new PrivatePerson();
		
	//	pp1.setName("Robert");
		
	//	System.out.println("The Private Persons name has been set to "+pp1.getName());
		
		PrivateStudent ps1 = new PrivateStudent();
		
		ps1.setName("Bob");
		
		ps1.setCourse("Revature");
		ps1.setScore(50);
		
		
		
		
		System.out.println("The Private Student1's name has been set to "+ps1.getName()+"\nthey are in the course set to: "+ ps1.getCourse());
		System.out.println(ps1.getName()+" does this: "+ps1.doSomething());
		ps1.apprear();

		PrivateEmployee worker1 = new PrivateEmployee();
  
		PrivateEmployee worker2 = new PrivateEmployee();

		worker1.setDepartment("HR");
		worker1.setName("Avery");
		worker1.setAge(26);
	
		worker2.setDepartment("Admin");
		worker2.setAge(30);
		worker2.setName("Admin");
		
		
		
		
		
		
		
		System.out.println("The Private Employee, "+worker1.getName()+" is in the "+worker1.getDepartment()+" Department");
		System.out.println(worker1.getName()+" does this: "+worker1.doSomething()+" at: "+worker1.getCompanyName());
	
		
		
		
	}

}
