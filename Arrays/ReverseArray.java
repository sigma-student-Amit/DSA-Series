import java.util.*;

public class ReverseArray {


    public static int[] reverseofArray(int arr[])
    {
        int n = (arr.length)/2;
        int left = 0, right = arr.length-1;

        for(int i=0; i<n; i++)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
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

    int[] ans = reverseofArray(arr);
    for(int val:ans)
    {
        System.out.println(val);
    }
}
}