package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractise {

	public static void main(String[] args) {
		
		
		
		//Declaration
		HashMap<Integer, String>  hm = new HashMap<Integer, String>();
		Map myMap = new HashMap();
		
		
		hm.put(100, "John");
		hm.put(101, "Jake");
		hm.put(102, "Scott");
		hm.put(101, "Adam");//will updated to the newer value
		hm.put(103, "David");
		
		
		//print
		System.out.println(hm);
		
		
		//remove pair
		hm.remove(101);
		System.out.println(hm);// 101 ==>Adam will be removed
		
		
		//access value of key
		System.out.println(hm.get(103));//Value of 103 ==>David will be pulled up
		
		
		//get the all the keys
		System.out.println(hm.keySet());//[100, 102, 103]
		
		//get the all the values
		System.out.println(hm.values());//[John, Scott, David]
		
		//all keys and values, altogether
		System.out.println(hm.entrySet());
		
		
		
		System.out.println("----------------------------");
		//Using for each loop
		for(int readMe:hm.keySet()) {
			
			System.out.println(readMe + "==> "+hm.get(readMe));
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
