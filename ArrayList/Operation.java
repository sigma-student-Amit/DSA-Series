import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Operation {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        

        // PRINT ALL ELEMENT IN THE FORM OF ARRAY
        System.out.println(list);


        // SET ANY ELEMENT THROUGH INDEX VALUE
        list.set(1, 100);
        System.out.println(list);
        

        //  REMOVE ANY ELEMENT WITH RESPECT TO INDEX VALUE
        list.remove(0);
        System.out.println(list);
        

        // SORTING OF ELEMENT IN ASCENDING ORDER
        Collections.sort(list);
        System.out.println("Sorting is : " + list);

        // REVERSE OF ARRAYLIST
        Collections.reverse(list);
        System.out.println("Reverse ArrayList is : " + list);
        
        // SORTING OF ELEMENT IN DESCENDING ORDER
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorting of Descending order is : " + list);
        
     }






}