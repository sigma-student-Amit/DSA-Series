
import java.util.*;

public class TopLeft {

    public static void starPrint(int n)
    {
        for (int i=1; i<=n; i++)
        {
            for (int j=1;  j<=(n-i)+1; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        starPrint(n);
    }
}