import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Nqueen {

    public static List<List<String>> solver(int n)
    {
        //board with all '.'
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        List<List<String>> res = new ArrayList<>();
        //hash type arrays to keep check of queens
        int[] leftrow = new int[n];
        int[] lowerdiagonal = new int[2*n-1];
        int[] upperdiagonal = new int[2*n-1];
        conditionbased(0,board,res,leftrow,lowerdiagonal,upperdiagonal);
        return res;
    }
    public static void conditionbased(int col,char[][] board,List<List<String>> res,int[] leftrow,int[] lowerdiagonal,int[] upperdiagonal)
    {
        if(col==board.length) {
            res.add(construct(board));
        }

        for(int row=0;row<board.length;row++) {
            if(leftrow[row]==0 && lowerdiagonal[col+row]==0 && upperdiagonal[board.length-1+col-row]==0) {
                
                board[row][col]='Q';
                leftrow[row]=1;
                lowerdiagonal[row+col]=1;
                upperdiagonal[board.length-1+col-row]=1;

                conditionbased(col+1, board, res, leftrow, lowerdiagonal, upperdiagonal);

                board[row][col]='.';
                leftrow[row]=0;
                lowerdiagonal[row+col]=0;
                upperdiagonal[board.length-1+col-row]=0;
            }
        }
    }
    public static List<String> construct(char[][] board) 
    {
        List<String> ans = new LinkedList<String>();
        for(int i=0;i<board.length;i++) {
            String s = new String(board[i]);
            ans.add(s);
        }
        return ans;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List < List < String >> queen = solver(n);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
        sc.close();
    }
    
}