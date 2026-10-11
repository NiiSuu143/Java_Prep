public class N_Knight {
    public static void printBoard(char[][] board) {
        System.out.println("-----------Chess Board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // The 8 possible relative moves for a knight
        int[] rowOffsets = { -2, -2, -1, -1, 1, 1, 2, 2 };
        int[] colOffsets = { -1, 1, -2, 2, -2, 2, -1, 1 };

        // Loop through all 8 possible knight moves
        for (int i = 0; i < 8; i++) {
            int newRow = row + rowOffsets[i];
            int newCol = col + colOffsets[i];

            // Check if the new position is within board boundaries
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                // If there is already a knight there, it's not safe
                if (board[newRow][newCol] == 'K') {
                    return false;
                }
            }
        }

        return true; // No attacking knights found
    }

    public static void nKnight(char[][] board, int row) {
        // base case
        if (row == board.length) {
            count++;
            printBoard(board);
            return;
        }

        // kaam -> recursion
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'K';
                nKnight(board, row + 1);
                board[row][j] = 'x'; // backtracking
            }
        }

    }

    static int count = 0;
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        long startTime = System.nanoTime();
        nKnight(board, 0);
        long endTime = System.nanoTime();
        
        System.out.println("Total no. of ways = "+count);
        System.out.println("Execution time: " + (endTime - startTime) / 1000000.0 + " ms");

        /**************
         * Time complexity = O(2^(n^2))
         * **************/
    }
}
