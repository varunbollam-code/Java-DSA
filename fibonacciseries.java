import java.util.Scanner;

public class fibonacciseries {
    public static int fibinacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
    return fibinacci(n-1)+fibinacci(n-2);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibinacci(n));
        sc.close();
    }
}
