public class Insertionsort {

    public static void InsertionS(int [] arr,int n)
    {
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr={13,46,52,24,20,9};
         int n=6;
        InsertionS(arr, n);
         for(int i=0;i<n;i++) 
         {
             System.out.println(arr[i]);
         }
    }
}
