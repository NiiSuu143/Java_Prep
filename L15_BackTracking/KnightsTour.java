public class KnightsTour {
    private static final int N = 8;

    // 8 possible L-shape moves for a knight
    private static final int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

    public static boolean solveKnightsTour() {
        int[][] board = new int[N][N];

        // Initialize all cells to -1 (meaning unvisited)
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                board[x][y] = -1;
            }
        }

        // Start the knight at the top-left corner (0, 0) with move number 0
        board[0][0] = 0;

        // Start recursion from (0, 0) with move count 1
        if (!solveKTUtil(0, 0, 1, board)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printBoard(board);
        }
        return true;
    }

    private static boolean solveKTUtil(int x, int y, int movei, int[][] board) {
        // BASE CASE: If all N*N cells are visited (movei reaches 64 for an 8x8 board)
        if (movei == N * N) {
            return true;
        }

        // Try all 8 possible next moves from the current coordinate (x, y)
        for (int k = 0; k < 8; k++) {
            int nextX = x + xMove[k];
            int nextY = y + yMove[k];

            // 1. Check if the move is safe and unvisited
            if (isSafe(nextX, nextY, board)) {
                // 2. CHOOSE: Mark the cell with the step number
                board[nextX][nextY] = movei; 

                // 3. EXPLORE: Recurse to the next move
                if (solveKTUtil(nextX, nextY, movei + 1, board)) {
                    return true;
                }

                // 4. UN-CHOOSE (BACKTRACK): If it fails, reset the cell back to -1
                board[nextX][nextY] = -1;
            }
        }

        return false;
    }

    // Helper to check boundaries and unvisited status
    private static boolean isSafe(int x, int y, int[][] board) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    private static void printBoard(int[][] board) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(board[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solveKnightsTour();
    }
}