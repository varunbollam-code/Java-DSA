import java.util.Scanner;

public class N_Numbers_reverse_BT {
    public static void Reverse_Backtaracking(int i,int n)
    {
        if(i>n)
        {
            return ;
        }
        Reverse_Backtaracking(i+1,n);
        System.out.println(i);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Reverse_Backtaracking(1,n);
        sc.close();
    }
}
