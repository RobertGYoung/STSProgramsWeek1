package com.revature.sts06.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Map<Integer,String> mapTest = new HashMap<Integer, String>();
		
		mapTest.put(0, "Rob");
		mapTest.put(1, "Jas");
		mapTest.put(2, "Ezra");
		mapTest.put(3, "Yong");
		mapTest.put(4, "Henry");
		

for(Map.Entry m:mapTest.entrySet())
	System.out.println(m.getKey()+": " + m.getValue());


	
		
		
		mapTest.merge(0, " Young The Third", String::concat);
		
		System.out.println(mapTest);
		
		
		
	}

}
