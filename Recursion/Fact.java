import java.util.Scanner;

public class Fact {


    public static int fact(int n)
    {
        if (n == 0)
        {
            return 1;
        }

        int fnm1 = fact(n-1);
        int ans = n*fnm1;

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the nth term");
        int n = sc.nextInt();
       int num =  fact(n);
       System.out.print("Factorial is : " + num);
    }
}
