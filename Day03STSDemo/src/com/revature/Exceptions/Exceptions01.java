package com.revature.Exceptions;

public class Exceptions01 {

	
public static void main(String[] args) {
	int[] myArr = new int[10];
	for(int i=0;i<=10;i++) { 
	
	try {
		myArr[i]=i*10;
		System.out.print(myArr[i]+" ");
		
	}
	
	catch(ArrayIndexOutOfBoundsException | NumberFormatException ex) {
		ex.printStackTrace();
	}
	finally {
	System.out.println("At least we finished because we caught the expression");
	}
	}
}
}
