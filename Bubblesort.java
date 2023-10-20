//package Sorting Algorithms;

public class Bubblesort {

    public static void BubbleS(int[] arr,int n)
    {
        for(int i=n-1;i>=1;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1]) 
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr={13,46,52,24,20,9};
         int n=6;
        BubbleS(arr, n);
         for(int i=0;i<n;i++) 
         {
             System.out.println(arr[i]);
         }
    }
}
