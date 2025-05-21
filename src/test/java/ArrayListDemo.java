import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Create an ArrayList
        List myList = new ArrayList(); // raw type which is not recommended

        ArrayList myList2 = new ArrayList(); // heterogeneous type which is contains any type of object

        ArrayList<String> list = new ArrayList<>(); //holds only String type objects

        // Add elements to the ArrayList
        myList2.add("Hello");
        myList2.add(123);
        myList2.add(45.67);
        myList2.add("Welcome");
        myList2.add(true);
        myList2.add(null);
        myList2.add(null);
        System.out.println("myList: " + myList2);

        System.out.println("Size of my List: " + myList2.size());

        myList2.remove(5); // remove element at index 5
        System.out.println("myList after removing element at index 5: " + myList2);
        System.out.println("Size of my List: " + myList2.size());

       myList2.add(2, "Added Value");
       System.out.println("Added value to index number 2: " + myList2);


       //Modify the list
        myList2.set(2, "Modified Value");
        System.out.println("Modified value at index number 2: " + myList2);


        //Access specific elements in the list
        myList2.get(2); // get element at index 2
        System.out.println("Element at index 2: " + myList2.get(2));

        //reading all elements from the list
        for(int i = 0; i < myList2.size(); i++) {
            System.out.print("Element at index " + i + ": " + myList2.get(i));
            System.out.println();
        }

        System.out.println("\n\n");

        //Reading all elements using for-each loop
        for(Object obj : myList2) {
            System.out.print(obj+",");
        }




    }
}
