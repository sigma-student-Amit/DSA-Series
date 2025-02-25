import java.util.Scanner;

public class Fibonacci {


    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        int nm1 = fibonacci(n-1);
        int nm2 = fibonacci(n-2);

        int ans = nm1 + nm2;
        return ans;
    }





    public static void main(String[] args) {
        System.out.println("Enter the number of term");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci Series is : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
//       int num =  fibonacci(7);
//       System.out.print(num);
    }
}
