public class RatMaze {
    public static void printMaze(int[][] maze) {
        System.out.println("--------Rat in a Maze------");
        for(int i=0; i<maze.length; i++) {
            for(int j=0; j<maze.length; j++) {
                System.out.print(maze[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void mazeSolver(int[][] maze, int row, int col, int[][] solution) {
        int n = maze.length;
        
        //  Boundary, Wall, and Already Visited Check
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || solution[row][col] == 1) {
            return;
        }

        // base case
        if (row == n - 1 && col == n - 1 && maze[row][col] == 1) {
            printMaze(solution); // Print this path's grid
            return;
        }
        
        // Mark current cell as part of the path in the solution matrix
        solution[row][col] = 1;

        // 4. Try all 4 directions explicitly
        mazeSolver(maze, row + 1, col, solution); // Down
        mazeSolver(maze, row, col - 1, solution); // Left
        mazeSolver(maze, row, col + 1, solution); // Right
        mazeSolver(maze, row - 1, col, solution); // Up

        // 5. BACKTRACK: Unmark the cell so alternative paths can use it
        solution[row][col] = 0;
        
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        int n = maze.length;
        int[][] solution = new int[n][n];

        mazeSolver(maze, 0, 0, solution);
    }
}
