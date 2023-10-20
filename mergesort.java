import java.util.Vector;

public class mergesort 
{
    public static void merge(int[] arr,int low,int mid,int high)
    {   
        Vector<Integer> v = new Vector<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right]) 
            {
                v.add(arr[left]);
                left++;
            } 
            else 
            {
                v.add(arr[right]);
                right++;
            }
        }
        // if elements r are leftover from left side
        while(left<=mid) 
        {
            v.add(arr[left]);
            left++;
        }
        //leftover elemnets from right side
        while(right<=high) 
        {
            v.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++) {
            arr[i]=v.get(i-low);
        }
    }

    public static void divide(int[] arr,int low,int high)
    {
        if(low>=high) return;
        int mid=low+(high-low)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String args[])
    {
        int low=0;
        int[] arr={3,2,1,6,5,4};
        int n=6;
        divide(arr, low, n-1);
        for (int i = 0; i < arr.length; ++i) 
        {
            System.out.print(arr[i]);
        }
    }
}
