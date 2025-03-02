import java.util.Scanner;

public class GCD_using_Recursion {


    public static int iGcD(int x ,int y)
    {
        if (y == 0 )
        {
            return x;
        }

        return iGcD(y, x % y);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();
        int result = iGcD(x , y);
        System.out.print(result);
    }
}
