import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubsetsumII {
    public static void solution(int index ,int[] arr,int n, List<List<Integer>> ans, List<Integer> ds) 
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<n;i++) {
            if(i>index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            solution(i+1, arr, n, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> ans(int[] arr,int n)
    {   
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        solution(0,arr,n,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(ans(arr,n));
        sc.close();
    }
}
