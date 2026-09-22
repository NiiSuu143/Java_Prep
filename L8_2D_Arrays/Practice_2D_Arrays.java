

public class Practice_2D_Arrays {
    public static void print_7s(int arr[][], int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(target == arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.print("No. of 7's in th 2d array = "+count);
    }

    public static void sumOfnumbers(int nums[][]) {
        int sum = 0;
        int row = 1, col = 0;
        while(col < nums[0].length) {
            sum += nums[row][col];
            col++;
        }
        System.out.println("Sum of the numbers in the 2nd row = "+sum);
    }

    public static void transpose(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // print
        for(int i=0; i<transpose.length; i++) {
            for(int j=0; j<transpose[0].length; j++) {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 1st Question -> print no. of 7's
        // int arr[][] = {{4, 7, 8},{8, 8, 7}};
        // print_7s(arr, 7);

        // 2nd Question -> print sum of the numbers in the second row of the nums array
        // int[][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        // sumOfnumbers(nums);

        // 3rd Question -> a program to find transpose of matrix
        int matrix[][] = {{11, 12, 13}, {21, 22, 24}};
        transpose(matrix);
    }
}
