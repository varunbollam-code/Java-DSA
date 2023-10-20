import java.util.List;
import java.util.ArrayList;

public class permutation1 {

    public static void solution(int index,int[] arr,List<List<Integer>> ans)
    {
        if(index==arr.length) {
            // we add array elements to da and then ans variable

            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<arr.length;i++) {
                ds.add(arr[i]);
            }
            //list of list
            ans.add(new ArrayList<>(ds));

        return;
        }

        for(int i=index;i<arr.length;i++) {
            swap(i, index, arr);
            solution(index+1, arr, ans);
            swap(i, index, arr);
        }
    }

    public static void swap(int i,int j,int[] arr)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String args[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {1,2,3};
        solution(0, arr, ans);
        System.out.println(ans);
    }
}