package Java.L8_2D_Arrays;

public class Staircase_Search {
    public static boolean staircase(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0) {
            if(key == matrix[row][col]) {
                System.out.println(key+" is found at ("+ row+ ","+col+ ")");
                return true;
            } else if(key < matrix[row][col]) {
                col--;  // move left
            } else {
                row++;  // move bottom
            } 
        }
        System.out.println(key+ " is not found.");
        return false;
    }
    public static void main(String[] args) {
        // Search in sorted matrix (row & col wide sorted)
        int matrix[][] = {{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        int key = 33;
        staircase(matrix, key);
    }
}
