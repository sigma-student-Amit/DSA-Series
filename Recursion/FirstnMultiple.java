import java.util.Scanner;

public class FirstnMultiple {


    public static void MultiplePrint(int n, int k)
    {
        if(k == 0)
        {
            return;
        }


        MultiplePrint(n, k-1);

        System.out.print(n*k + " ");
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();

        MultiplePrint(n, k);
    }
}
