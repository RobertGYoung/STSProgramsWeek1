package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListDemoWithInterfaces {
	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(7);
		
		List mySecondList = new ArrayList();
		mySecondList.add(100);
		mySecondList.add(101);
		mySecondList.add(102);
//		System.out.println("Size of List: "+myList.size());
//		
//		myList.remove(3);
		System.out.println("Size of List after removal: "+myList.size());
		
		myList.addAll(myList.size(),mySecondList);
		System.out.println("Size of First List after adding all from Second List : "+myList.size());
		System.out.print("[ ");
		myList.remove(myList.indexOf(100));
		
		for(Object a :myList) {
			System.out.print(a+" ");
		}
		System.out.println("]");

		if(myList.contains(100)){
			System.out.println("contains 100");
		}
		else {
			System.out.println("does not contain 100");
		}
		


		
		
		
		
		
	}
}
