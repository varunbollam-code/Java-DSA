public class sudokosolver {
    public static boolean solver(char[][] board)
    {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                // checking for empty
                if(board[i][j]=='.') {
                    for(char c='0';c<'9';c++) {
                        if(isvalid(board, i, j, c)) {
                            board[i][j]=c;
                        if(solver(board)) 
                            return true;
                        else
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(char[][] board,int row,int col,char c)
    {   for(int i=0;i<9;i++){
        if(board[row][i]==c)
            return false;
        if(board[i][col]==c)
            return false;
        if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        char[][] board={
                        {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                        {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                        {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                        {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                        {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                        {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                        {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                        {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                        {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
                        };
        solver(board);

    for(int i=0;i<9;i++) {
          for(int j=0;j<9;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
