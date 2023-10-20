import java.util.Scanner;

public class N_factorial {
    //parametrized
    public static void factorial(int n,int res)
    {
        if(n<1)
        {
            System.out.println(res);
            return;
        }
        factorial(n-1, res*n);
    }
    //function itself
    public static int Factorial(int n)
    {
        if(n==0) 
        {
            return 1;
        }
        return n*Factorial(n-1);
    }
   
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        factorial(x, 1);
        System.out.println(Factorial(x));
        sc.close();
    }
}
