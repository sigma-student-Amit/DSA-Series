import java.util.*;

public class sumofArrayElement {


    public static int sum(int arr[])
    {   
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }

        return sum;
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
    int sum = sum(arr);
    System.out.println("Sum of Array Element is : " + sum);
  }
}