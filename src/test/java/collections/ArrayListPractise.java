package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractise {

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
		arl.add(3, "2 LA");
		//After indexing
		System.out.println("After indexing "+arl);
		
		
		//Modify ArrayList ==>modify/replace/change
		arl.set(2, "Good By");
		System.out.println("After replacing: "+arl);
		
		//Read particular element from ArrayList
		System.out.println(arl.get(4));
		System.out.println(arl.get(7));
		
		
		//for loop
		for(int i=0; i<arl.size(); i++) {
			System.out.println(arl.get(i));
		}
		
		//for each loop
		for(Object obj : arl) {//Object is a super class of all classes
			System.out.println(obj);
		}
		
		
		
		Iterator it = arl.iterator();
		while(it.hasNext()) {
			
			System.out.println("New print with next: "+it.next());
		}
		
		//we use iterator for safe removal
		
		
		//Checking arrayLisy empty?
		System.out.println("Is arraylist empty:"+arl.isEmpty()); //answer will be ==>false
		
		
		//remove multiple specific elements from arrayList
		ArrayList arl2 = new ArrayList();
		arl2.add("Good By");
		arl2.add("2 LA");
		
		System.out.println("Before removal: "+arl);
		arl.removeAll(arl2);
		System.out.println("After removal Good By and 2 LA "+arl);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
