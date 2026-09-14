package Java.L8_2D_Arrays;
import java.util.Scanner;

public class Arrays_2d {
    public static boolean keySearch(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println(key+" is found at index ("+i+" , "+j+ ")");
                    return true;
                }
            }
        }
        System.out.println(key+" is not found.");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int row = matrix.length;
        int column = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3x3 matrix : ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // print 2d matrix
        System.out.println("This is your matrix : ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        keySearch(matrix, 5);
        sc.close();
    }
}
