package com.revature.day04.comparable;

public class ComparablePerson implements Comparable<ComparablePerson> {
	
	private String name;
	private int id;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;

	}
	public ComparablePerson() {
		
	}
	
	public ComparablePerson(int age,String name,int id) {
		this.setName(name);
		this.setAge(age);
		this.setId(id);
		
		
	}
	@Override
	public String toString() {
		return "ComparablePerson [name=" + name + ", id=" + id + ", age: "+age+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	ComparablePerson other = (ComparablePerson) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(ComparablePerson anotherPerson) {
		// TODO Auto-generated method stub
		return this.getId()-anotherPerson.getId();
	}
	

	
	
	

}