import java.util.Scanner;

public class palindromestring {
    public static boolean palindrome(int i,String name,int n)
    {
        if(i>=n/2)
        {
            return true;
        }
    //code

    return palindrome(i+1, name, n);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //code
        sc.close();
    }
}
