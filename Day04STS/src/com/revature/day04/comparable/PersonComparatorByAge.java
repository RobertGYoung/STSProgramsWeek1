

package com.revature.day04.comparable;
import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Object>{

	
		@Override
		public int compare(Object person1, Object person2) {
			Integer age1=((ComparablePerson) person1).getAge();
			Integer age2=((ComparablePerson) person2).getAge();
			return age1.compareTo(age2);
		}
	}
