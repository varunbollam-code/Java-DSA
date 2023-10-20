import java.util.Scanner;
import java.util.Vector;

public class subsequences {
    public static void sequence(int i, Vector<Integer> v1, int[] arr, int n) {
        if (i == n) {
        System.out.println(v1);
        return;
        }
        v1.add(arr[i]);
        sequence(i + 1, v1, arr, n);
        v1.removeElementAt(v1.size()-1);
        sequence(i + 1, v1, arr, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String s="varun";
        // char[] arr=s.toCharArray();
        Vector<Integer> v1 = new Vector<>();
        int[] arr = { 3, 2, 1 };
        int n=3;
        sequence(0, v1, arr, n);
        sc.close();
    }
}
