import java.util.*;

public class maxValueofArray {


//    public static void Print(int arr[], int indx)
//    {
//        if (indx == arr.length)
//        {
//            return;
//        }
//
//        System.out.print(arr[indx] + " ");
//        Print(arr,indx+1);
//    }

    public static int maxArray(int arr[], int idx)
    {
        if (idx == arr.length-1)
        {
            return arr[idx];
        }

        int smallAns = maxArray(arr, idx+1);

       return Math.max(arr[idx], smallAns);
    }

    


    public static void main(String[] args) {
        int arr[] = {10, 43, 56, 42, 65};

//        Print(arr, 0);
        System.out.print("Max value of array is : ");
       System.out.print(maxArray(arr, 0));
    }
}
