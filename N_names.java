import java.util.Scanner;

class names {
    public static void printnames(int i,int n)
    {
        if(i>n) 
        {
            return ;// true 
        } 
    //false
    System.out.println("Varun");
    printnames(i+1, n);
    }

    public static void main(String[] args) 
    {   
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        printnames(1, x);
        sc.close();
    }
}           