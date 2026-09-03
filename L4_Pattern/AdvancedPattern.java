package Java.L4_Pattern;


public class AdvancedPattern {
    public static void hollow_rectangle(int totRow, int totCol) {
        // outer loop for rows
        for(int i = 1; i <= totRow; i++) {
            // inner loop for column
            for(int j = 1; j <= totCol; j++) {
                if(i == 1 || i == totRow || j == 1 || j == totCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int n) {
        for(int i = 1; i <= n; i++) {
            // for space
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // for stars
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_number(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n+1-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_traiangle(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // inverted_half_pyramid(4);
        // inverted_half_pyramid_with_number(5);
        floyd_traiangle(5);
    }
}
