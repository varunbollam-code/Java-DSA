import java.util.Scanner;
import java.util.Vector;

public class Anyonesubseqeunce {
    
    public static boolean sequence(int i,Vector<Integer> v1,int[] arr,int sum,int s)
    {
        if(i==arr.length)
        {
            if(s==sum)
            {
                System.out.println(v1);
                return true;
            }
            else return false;
        }
        v1.add(arr[i]);
        s+=arr[i];
       if(sequence(i+1, v1, arr, sum, s)==true ) return true;

        s-=arr[i];
        v1.removeElementAt(v1.size()-1);
        if(sequence(i+1, v1, arr, sum, s)==true) return true;

    return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        Vector<Integer> v1 = new Vector<>();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sequence(0, v1, arr, sum, 0);
        sc. close();
    }
}
