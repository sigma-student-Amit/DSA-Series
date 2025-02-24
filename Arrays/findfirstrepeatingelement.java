import java.util.*;

public class findfirstrepeatingelement {

    public static int firstrepeatedelement(int arr[])
    {
        int ans=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    ans = arr[i];
                }
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


        System.out.println("first element is : " + firstrepeatedelement(arr));
}

}