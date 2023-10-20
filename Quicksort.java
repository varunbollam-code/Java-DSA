public class Quicksort {

    public static int Solution(int[] arr,int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1) {
                i++;
            }
            while(arr[j]>pivot && j>=i+1) {
                j--;
            }
            
        }
        return 0;
    }
    public static void qS(int[] arr,int low,int high)
    {
        int parindx= Solution(arr, low, high);
        qS(arr, low, parindx-1);
        qS(arr, parindx+1, high);
    }
    public static void main(String args[])
    {

    }
}
