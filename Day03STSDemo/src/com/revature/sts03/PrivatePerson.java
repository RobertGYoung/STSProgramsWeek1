package com.revature.sts03;

public abstract class PrivatePerson {

		private String name;
		private int age;
		
		public PrivatePerson() {
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	
		
		public abstract String doSomething();	

	
	
	
}
