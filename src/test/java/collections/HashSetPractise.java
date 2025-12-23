package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractise {

	public static void main(String[] args) {


		Set myset1 = new HashSet();
		HashSet myset2 = new HashSet();
		
		
		myset2.add(100);
		myset2.add(100);
		myset2.add(true);
		myset2.add("welcome");
		myset2.add(10.5);
		myset2.add('C');
		myset2.add(null);
		myset2.add(null);

		
		//Printing HashSet 
		System.out.println(myset2);//[null, C, 100, 10.5, welcome, true]
		
		//Removing element
		myset2.remove('C');// C will be removed
		System.out.println(myset2);//[null, 100, 10.5, welcome, true] <== C removed
		
		
		//Inserting element not possible
		//Access specific element not possible
		
		
		
		//How to access specific element in HashSet with a workaround
		//Convert HashSet into ArrayList
		
		ArrayList arl = new ArrayList(myset2);
		System.out.println(arl);
		System.out.println(arl.get(3));
		
		
		//Read all the elements using for each loop
		
		System.out.println("------------------------");
		for(Object readMe :myset2) {
			System.out.println(readMe);
		}
		
		
		System.out.println("------------------------");
		//Size of HashSet
		System.out.println("Size of my set: "+myset2.size());
		
		
		
		
		
		
		
		

	}

}
