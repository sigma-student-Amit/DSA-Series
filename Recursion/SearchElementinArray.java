public class SearchElementinArray {


    public static boolean Search(int arr[], int n, int target, int idx)
    {
        if (idx >= n)
        {
            return false;
        }

        if (arr[idx] == target) return true;

        if(Search(arr, n, target, idx+1))
        {
            return true;
        }
        else {
            return false;
        }
    }




    public static void main(String[] args) {
        int arr[] = {20, 34, 54, 23, 51, 65};
        int target = 23;
        int n = arr.length;

        if(Search(arr, n, target, 0)){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }

    }
}
