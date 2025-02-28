import java.util.Scanner;

public class SumofnNatural {


    public static int SumPrint(int n)
    {
        if (n == 0) {
            return n;
        }

        int fnm1 = SumPrint(n-1);

        return fnm1 + n;
    }





    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the nth number : ");
        int n = sc.nextInt();

        int result = SumPrint(n);
        System.out.println("Sum of n number is : " + result);
    }
}
