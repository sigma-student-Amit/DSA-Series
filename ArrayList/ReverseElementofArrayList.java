import java.util.*;
import java.util.ArrayList;

public class ReverseElementofArrayList {



    public static void reverseArrayList(ArrayList<Integer> list)
    {
        int i=0, j=list.size()-1;

        while(i < j)
        {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }






public static void main(String args[])
{
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(50);
    list.add(30);
    list.add(70);
    list.add(40);
    list.add(20);
    list.add(60);
    
    System.out.println("Original ArrayList is : " + list);

    reverseArrayList(list);
    System.out.println("ReverseArrayList is : " + list);
}

}