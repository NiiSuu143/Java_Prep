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

    public static void triangle_01(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        // for upper half 
        for(int i = 1; i <= n; i++) {
            // for left side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // for right side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for lower half 
        for(int i = n; i >= 1; i--) {
            // for left side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // for right side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n) {
        // upper half triangle
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half triangle
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // inverted_half_pyramid(4);
        // inverted_half_pyramid_with_number(5);
        // floyd_traiangle(5);
        // triangle_01(5);
        // butterflyPattern(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond_pattern(4);
    }
}
