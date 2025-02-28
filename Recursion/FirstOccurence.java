public class FirstOccurence {

    public static int Indexoffirst(int arr[], int key, int i)
        {
            if(i == arr.length) 
                    {
                        return -1;
                    }
            if(arr[i] == key) 
                {
                    return i;
                }
              return  Indexoffirst(arr, key, i+1);
        }



    public static void main(String args[])
        {
            int arr[] = {2, 50, 24, 76, 5, 2, 5, 45, 56};
            int key = 5;
           int index = Indexoffirst(arr, key, 0);
           System.out.print(index);
        }
}