package com.revature.sts02.afterlunch;

public class Artitmetic {
	public static void main(String[] args) {
		
	
	
	
	
	
	try {
		int num1,num2, result;
		
		num1 = Integer.parseInt(args[0]);
		
		num2 = Integer.parseInt(args[1]);

		result = num1 +num2;
		System.out.println(result);
		
	}
	catch(NumberFormatException bob) {
		bob.printStackTrace();
		System.out.println("You have not used int, and instead used unparceable Strings but weve handled it and instead concatinated your input");
		String num1,num2, result;
		num1=args[0];
		num2=args[1];
		result = num1 +num2; 
		System.out.println(result);
	}
	finally {
		System.out.println("The program has ended.");
	}
	}
	}


