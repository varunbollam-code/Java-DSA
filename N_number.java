import java.util.Scanner;

public class N_number {
    public static void numbers(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        numbers(i+1,n);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        numbers(1,n); 
        sc.close();
    }
}
