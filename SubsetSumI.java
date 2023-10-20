import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// The subsetsumI problem from striver will solve the sum of each subset and return List type.
public class SubsetSumI {
    public static void solution(int i,int[] arr,int n,int sum, ArrayList<Integer> ds) 
    {
        if(i==n) {
            ds.add(sum);
            return;
        }
        //pick up
        solution(i+1, arr, n, sum+arr[i], ds);
        //not pick up
        solution(i+1, arr, n, sum, ds);
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ds= new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        solution(0,arr,n,0,ds);
        Collections.sort(ds); // we use collections.sot() to sort the arraylists.
        System.out.println(ds);
        sc.close();
    }
}
