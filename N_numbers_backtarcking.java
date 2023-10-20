import java.util.Scanner;

public class N_numbers_backtarcking 
{
    public static void backtracking(int i,int n)
    {
        if(i<1)
        {
            return;
        }
    // Backtracking : values print from back.
    backtracking(i-1, n);
    System.out.println(i);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        backtracking(n, n);
        sc.close();
    }
}
