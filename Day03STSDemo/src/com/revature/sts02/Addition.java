package com.revature.sts02;

public class Addition {
public static void main(String[] args) {
	/*int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);

	System.out.println(num1 + num2);*/
	
	int [] myArgs= new int[args.length];//make array and store length
	for(int i=0;i<args.length;i++){
		myArgs[i]=Integer.parseInt(args[i]); 	//fill array with arguments at index i 
	}
	
	System.out.println("Sum: "+add(myArgs)); //link to outside method
	}

public static int add(int ...elementsInArray){			//make a method that returns a value; declare type of spread through parameters

		int [] nums = elementsInArray;					//make new array containing spread values (from previous array)
		int result = 0;
		for (int i = 0; i<nums.length;i++){				//add stored value to the new array at index i 
				result =result+nums[i];
				}
return result;											//return value to be used in main 

	}

}
