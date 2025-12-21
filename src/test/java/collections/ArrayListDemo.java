package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList arl = new ArrayList();
		List arlList = new ArrayList();
		ArrayList<Integer> arlInteger = new ArrayList<Integer>();
		List<String> arlListHeto = new ArrayList<String>();
		List<Object> arlListObject = new ArrayList<Object>();
		
		
		arl.add("100");
		arl.add(100);
		arl.add("welcome");
		arl.add(true);
		arl.add(null);
		arl.add('C');
		arl.add(null);
		arl.add(100);
		arl.add(.223);
		
		//Printing arrayList
		System.out.println(arl);
		
		
		//Size of arrayList
		System.out.println(arl.size());
		
		
		//Removing element in arrayList
		System.out.println("Before removing element"+ arl);
		System.out.println(arl.remove(5));//C will be removed
		System.out.println("After removing element"+ arl);
		
		
		
		//Inserting new element into ArrayList
		//Before insertion
		System.out.println("Before indexing: "+arl);
		arl.add(3, " 2 America");
		//After indexing
		System.out.println("After indexing "+arl);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
