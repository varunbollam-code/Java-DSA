import java.util.Scanner;
import java.util.Vector;

public class countsumofsequences {
    public static int countsequence(int i,Vector<Integer> v1,int[] arr,int sum,int s)
    {
        if(i==arr.length)
        {
            if(s==sum)
            {
                System.out.println(v1);
                return 1;
            }
            else return 0;
        }
        v1.add(arr[i]);
        s+=arr[i];
        int l=countsequence(i+1, v1, arr, sum, s);

        s-=arr[i];
        v1.removeElementAt(v1.size()-1);
        int r=countsequence(i+1, v1, arr, sum, s);
    return l+r;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[] arr = new int[n];
       // Vector<Integer> v1= new Vector<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Vector<Integer> v1= new Vector<>();
        int res=countsequence(0,v1, arr, sum,s);
        System.out.println(res);
        sc.close();
    }
}
