import java.util.*;

public class EvenfirstOddlast {


    public static void Evenfirstoddlast(int arr[])
    {
        int left = 0;
        int right = arr.length-1;
        
        while(left < right)
        {
            if(arr[left] %2 != 0 && arr[right]%2 == 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if(arr[left] %2 == 0)
            {
                left++;
            }

            if(arr[right] %2 != 0)
            {
                right--;
            }
        }
        System.out.print("Even number comes first and Odd number comes last ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }





    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        Evenfirstoddlast(arr);
}


    
}