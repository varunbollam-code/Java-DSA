import java.util.Scanner;
import java.util.Vector;

public class SubsquenceKsum {
    public static void sum(int i,Vector<Integer> v1,int[] arr,int sum,int s)
    {
        if(i==arr.length)
        {   
            if(s==sum)
            {
            System.out.println(v1);
            }
        return;
        }
        v1.add(arr[i]);
        s+=arr[i];
        sum(i+1,v1,arr,sum,s);

        s-=arr[i];
        v1.removeElementAt(v1.size()-1);
        sum(i+1,v1,arr,sum,s);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s=0;
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Vector<Integer> v1 = new Vector<>();
        sum(0, v1, arr, sum,s);
        sc.close();
    }
}
