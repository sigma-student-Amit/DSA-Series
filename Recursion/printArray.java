public class printArray {


    public static void Print(int arr[], int indx)
    {
        if (indx == arr.length)
        {
            return;
        }

        System.out.print(arr[indx] + " ");
        Print(arr,indx+1);
    }



    public static void main(String[] args) {
        int arr[] = {10, 76, 45, 80, 65};
        Print(arr, 0);
    }
}

