import java.util.ArrayList;

public class swap {
    
    public static void swap(ArrayList<Integer> list, int indx1, int indx3)
    {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx3));
        list.set(indx3, temp);
    }


    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(6);

        int idx1 = 0, idx3 = list.size()-1;
        System.out.println("Original ArrayList is : " + list);
        swap(list, idx1, idx3);
        System.out.print("After swapping of two element : " + list);
        
    }
}