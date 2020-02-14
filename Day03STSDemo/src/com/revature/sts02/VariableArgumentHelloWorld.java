package com.revature.sts02;

public class VariableArgumentHelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Hello "+nameWithSpace(args));
	}
	
	public static String nameWithSpace(String...name) {
		String fullName="";
		for(String i :name) {
			fullName = fullName+ " "+i;
		}
		return fullName;
	}

}
