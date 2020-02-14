package EmployeeDatabse;

import java.util.*;

public class Employee extends EmployeeList{
	static int id=100;
	static Set<Object> employeeSet = new HashSet(); //adds individual employee list to this 
	static Map<Integer,List> database = new HashMap<Integer,List>();
	public Employee() {
		id++;
	}
	

private String name;
private Integer age;
private String department;
private Double salary;
public int employeeID;

public Employee(String name, int age, String department, Double salary) {
this.name=name;
this.age=age;
this.department=department;
this.salary= salary;

id++;
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}

List employeeList = new ArrayList();


public void addToDatabase() {
	
	employeeList.add(this.getName());
	employeeList.add(this.getAge());
	employeeList.add(this.getDepartment());
	employeeList.add(this.getSalary());
	
	employeeSet.add(this.employeeList);
	
	database.put(this.id,this.employeeList);

}


	
}
