import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combinationsum {

    public static void findcombinations(int i,int[] arr,int tar, List<List<Integer>> ans, List<Integer> ds)
    {
        if(i==arr.length) {
            if(tar==0) {
                ans.add(new ArrayList<>(ds));
            }
        return;
        }
        // The below is to execute one index many times umtil
        // pick
        if(arr[i]<= tar) {
            ds.add(arr[i]);
            findcombinations(i, arr, tar-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
        //not pick if arr[i] > target
        findcombinations(i+1, arr, tar, ans, ds);
    }
    public static List<List<Integer>> print(int[] arr,int tar,int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findcombinations(0,arr,tar,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(print(arr,tar,n));
        sc.close();
    }
}
