package com.revature.sts06.collections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

import java.util.Collection;
import java.util.Collections;

public class CollectionTest {
	
	public static void main(String[] args) {
		
	
	List<Object> myList = new ArrayList<Object>();
	List<Object> mySecondList = new ArrayList<Object>();

	
//	myList.add(1);
//	myList.add(2);
//	myList.add(3);
//	
//	mySecondList.add(101);
//	mySecondList.add(102);
//	mySecondList.add(103);
//	mySecondList.addAll(myList);
//
//	Iterator myListItr = myList.iterator();
//	System.out.println("iterator loop---");
//	while(myListItr.hasNext()) {
//		System.out.println(myListItr.next());
//	}
//	System.out.println("---enhanced for");
//	for(Object item:myList) {
//		System.out.println(item);
//	}
//	System.out.println("lamda for each----");
//	myList.forEach(list->{System.out.println(list);});
//	
//	System.out.println(mySecondList);
//	System.out.println("Empty:"+ mySecondList.isEmpty());
//	System.out.println("Does this have 101?:"+mySecondList.contains(101));
//	mySecondList.remove(mySecondList.get(0));
//	System.out.println("Does this have 101?:"+mySecondList.contains(101));
//
//	mySecondList.clear();
//	System.out.println(myList.re
//	System.out.println(mySecondList);
//	System.out.println("Empty: "+mySecondList.isEmpty());
//	System.out.println(myList.remove);
//	
	
	double a;
	List unSortedList = new ArrayList();

	for(int i =0; i<100;i++) {
		
		unSortedList.add(Math.floor((Math.random()*100)*i));
	}
	System.out.println("Unsorted: "+unSortedList);
	
	Collections.sort(unSortedList, Collections.reverseOrder()
			);
	System.out.println("Sorted:" +unSortedList);
	
	
	
	}
	
	

	
}
