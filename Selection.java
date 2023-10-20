
public class Selection {
        public static void sort(int[] arr,int n) 
    {
         for(int i=0;i<=n-2;i++) 
        {
             int mini=i;
             for(int j=i;j<=n-1;j++)
             {
                 if(arr[j]<arr[mini]) {
                     mini=j;
                 }
             }
         int temp=arr[mini];
         arr[mini]=arr[i];
         arr[i]=temp;
        }
    }
    public static void main(String args[])
    {
         int[] arr={13,46,52,24,20,9};
         int n=6;
         sort(arr, n);
         for(int i=0;i<n;i++) 
         {
             System.out.println(arr[i]);
         }
    }
}
     
