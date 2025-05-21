import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Create an ArrayList
        List myList = new ArrayList(); // raw type which is not recommended

        ArrayList myList2 = new ArrayList(); // heterogeneous type which is contains any type of object

        ArrayList<String> list = new ArrayList<>(); //holds only String type objects

        // Add elements to the ArrayList
        myList.add("Hello");
        myList.add(123);
        myList.add(45.67);
        myList.add(true);
        System.out.println("myList: " + myList);
        System.out.println("myList: " + myList);


    }
}
