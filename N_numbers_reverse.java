import java.util.Scanner;

public class N_numbers_reverse {
    public static void numbersreverse(int i,int n)
    {
        if(i<1)
        {
            return;
        }
    System.out.println(i);
    numbersreverse(i-1, n);
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        numbersreverse(n,n);
        sc.close();
    }
}
