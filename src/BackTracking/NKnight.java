package BackTracking;
public class NKnight {
    public static void main(String[] args) {
        int n=5;
        boolean board[][]=new boolean[n][n];
        System.out.println(knights(board,0));
    }

    private static int knights(boolean[][] board, int row) {
        if (row == 0) {
        display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for (int col = 0; col <board.length ; col++) {
           if( isSafe(board,row,col)){
                board[row][col]=true;
                count+=knights(board,row-1);
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i <row-2 ; i++) {

        }
        for (int i = 0; i <row-2 ; i++) {

        }
        for (int i = 0; i <row-2 ; i++) {

        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean arr[]:board
             ) {
            for (boolean ele:
                    arr
                 ) {
                if(ele)
                {
                    System.out.println("X");
                }
                else {
                    System.out.println("0");
                }

            }

        }
    }
}
