import java.util.*;

public class largestElement {

    public static int largestElement(int arr[])
    {
        int largest = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        return largest;
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
System.out.print("Largest Element of Array is : ");
  System.out.println(largestElement(arr));


}
}