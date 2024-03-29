
import java.util.*;
public class UtilitySort {

public static void main(String[] args) {
	Integer[] integers = new Integer[] {10,7,3,4,2,5,9};
	
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(integers));
	
	Iterator<Integer> itr = list.iterator();//associating iterator to navigate the collection 
	
	System.out.print("[");
	while(itr.hasNext()==true) {
		
		System.out.print(itr.next()+" ");
		
	}
	System.out.println("]");
	
	Collections.sort(list);
	
	itr=list.iterator();// associates 
	
	System.out.print("[");
	while(itr.hasNext()==true) {
		
		System.out.print(itr.next()+" ");
		
	}
	System.out.println("]");
}	

}
