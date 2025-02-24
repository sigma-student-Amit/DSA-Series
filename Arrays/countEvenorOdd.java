import java.util.*;

public class countEvenorOdd {

    
    public static int EvenorOdd(int arr[])
    {
        int even = 0, odd=0;
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i] % 2 == 0) {
             return  even++;
            }
            else{
               return odd++;
            }
        }
     
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


int sum = EvenorOdd(arr);
 System.out.println(sum);
//  System.out.println(su);

 }
}