package BackTracking;

public class Nqueen {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][n];
        System.out.println(queen(board,0));

    }
    static int queen(boolean [][] board,int row)
    {
        if(row == board.length )
        {
            disply(board);
            System.out.println();
             return 1;
        }
        int count=0;
        for (int c = 0; c <board.length ; c++) {
             if(isSafe(board,row,c))
            {
             board[row][c]=true;
             count+=queen(board,row+1);
             board[row][c]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int c) {
        for (int i = 0; i <row ; i++) {
            if(board[i][c])
            {
                return  false;
            }
        }
        int min=Math.min(row,c);

        for (int i = 1; i <= min; i++) {
           if( board[row-i][c-i])
           {
               return  false;
           }
        }
        int max=Math.min((board.length-c-1),row);
        for (int i = 0; i <=max ; i++) {
            if( board[row-i][c+i])
            {
                return  false;
            }
        }
        return true;
    }
    static void disply(boolean [][] board)
    {
        for (boolean row[]:board) {
            for ( boolean ele:row)
            {
                if(ele==true)
                {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }

            }
            System.out.println();

        }
    }
}
