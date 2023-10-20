import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combinationsumm2 {
    public static void solution(int ind, int target, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        // in the combination sum II , iteratioin will not take the duplicates
        if(target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for( int i=ind;i<arr.length;i++) {
            
            if(i>ind && arr[i]==arr[i-1]) continue;
          
            if(arr[i]>target) break; 

            ds.add(arr[i]);
            // Here we should pass i not ind;
            solution(i+1, target-arr[i], arr, ans, ds);
            ds.remove(ds.size()-1);
        }

    }

    public static List<List<Integer>> print(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // we need to sort the array.(IMP)
        Arrays.sort(arr);
        solution(0, target, arr, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(print(arr, target));
        sc.close();
    }
}
//Revision 10 1 2 7 6 1 5
