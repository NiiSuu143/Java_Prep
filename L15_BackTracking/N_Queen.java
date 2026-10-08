public class N_Queen {
    public static void printBoard(char[][] board) {
        System.out.println("---------Chess Board--------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void nQueen(char[][] board, int row) {
        // base case
        if(row == board.length) {
            printBoard(board);
            return ;
        }

        // column loop
        for(int j=0; j<board.length; j++) {
            board[row][j] = 'Q';
            nQueen(board, row+1);   // function call
            board[row][j] = 'x';    // backtracking
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        // initialization
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueen(board, 0);
    }
}
