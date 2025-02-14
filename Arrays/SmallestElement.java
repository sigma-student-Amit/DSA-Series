import java.util.*;

public class SmallestElement {


    public static int Smallest(int arr[])
    {
        int Smallest = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < Smallest)
            {
                Smallest = arr[i];
            }
        }
        return Smallest;
    }



public static void main(String args[])
{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the size of Array");
    int size = scn.nextInt();

    int arr[] = new int[size];
    System.out.println("Enter the elements of an Array");
    for(int i=0; i<size; i++)
    {
        arr[i] = scn.nextInt();
    }

    int smallestElement = Smallest(arr);
    System.out.print("Smallest Element of Array is : " + smallestElement);

}

}