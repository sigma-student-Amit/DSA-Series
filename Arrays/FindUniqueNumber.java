// "static void main" must be defined in a public class.
import java.util.*;

public class FindUniqueNumber {
    
    public static int findUniqueNumber(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        
        int ans = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != -1)
            {
             ans = arr[i];
            }
        }
        return ans;
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scn.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements");
        for(int i=0; i<size; i++)
        {
            arr[i] = scn.nextInt();
        }
        
    System.out.println("Unique number is : " + findUniqueNumber(arr));
    }
}