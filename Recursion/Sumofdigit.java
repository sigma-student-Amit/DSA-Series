import java.util.*;


public class Sumofdigit {

    public static int sod(int n)
    {
        // BASE CONDITION

        if(n >=0 && n<=9) return n;
//        {
//            return n;
//        }

        return sod(n/10) + n%10;

//        int nm1 = sod(n/10);
//        int ld = n%10;
//        int ans = ld + nm1;
//
//        return ans;

    }
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer value : ");
        int n = sc.nextInt();
        int result =  sod(n);
        System.out.print("Sum of digit is : " + result);
    }
}