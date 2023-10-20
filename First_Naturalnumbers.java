import java.util.Scanner;

public class First_Naturalnumbers {
    
    //paramaterized
    public static void naturalnumbers(int n,int sum)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;
        }
    naturalnumbers(n-1,sum+n);
    }
    // function it self
    public static int  NaturalNumbers(int n)
    {
        if(n==0)
        {
            return 0;
        }
    return n+NaturalNumbers(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        naturalnumbers(x, 0);
        int res=NaturalNumbers(x);
        System.out.println(res);
        sc.close();
    }
}
