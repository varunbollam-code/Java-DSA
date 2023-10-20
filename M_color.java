import java.util.ArrayList;
import java.util.List;

public class M_color {
    // Imcomplexity is (O(M^n)*n)
    // checking for safe of colour to place at particular node
    public static boolean isafe(int node, List<Integer>[] G, int[] color, int n, int m) {
        for (int it : G[node]) {
            if (color[it] == m)
                return false;
        }
        return true;
    }

    // It is having recursive function and assign the value of color array that
    // states that color is assigned to the node
    public static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m) {
        if (node == n)
            return true;

        for (int i = 1; i <= m; i++) {
            if (isafe(node, G, color, n, i)) {
                color[node] = i;
                if (solve(node + 1, G, color, n, m))
                    return true;
                else
                    color[node] = 0;
            }

        }
        return false;
    }

    // calling recursive function and if it is true then returns true
    public static boolean graphcoloring(int node, List<Integer>[] G, int[] color, int m) {
        int n = G.length;
        if (solve(node, G, color, n, m) == true)
            return true;
        return false;
    }

    // main method calling the functions
    public static void main(String args[]) {
        int N = 4; // nodes
        int m = 3; // colors
        List<Integer>[] G;
        G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<Integer>();
        }
        int[] color = new int[N];
        G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[2].add(3);
        G[3].add(2);
        G[3].add(0);
        G[0].add(3);
        G[0].add(2);
        G[2].add(0);
        boolean ans = graphcoloring(0, G, color, m);
        System.out.println(ans);

    }
}
