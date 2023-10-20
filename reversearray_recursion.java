import java.util.Scanner;

public class reversearray_recursion {
    public static void reverse(int l,int arr[],int r)
    {
        if(l>=r)
        {
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        
        reverse(l+1, arr, r-1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        //input
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(0, arr, n-1);
        //output
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
