import java.util.*;

public class BottomLeft {


    public static void starPattern(int n)
    {
        // R for ROWS & C for COLUMNS
        for(int r=0; r<n; r++)
        {
            for(int c=0; c<n; c++)
            {
                if (r-c >= 0) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        starPattern(n);
    }

}
