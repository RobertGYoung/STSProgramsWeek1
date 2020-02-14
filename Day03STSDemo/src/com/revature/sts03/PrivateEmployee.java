package com.revature.sts03;

public class PrivateEmployee extends PrivatePerson {

	private String department;
	public static final String companyName="Revature";
	

	public PrivateEmployee() {
		
	}
	
	public String getDepartment() {
		
		return department;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}




	@Override
	public String doSomething() {
		return "Works";
		
	}
	
	
	
}
