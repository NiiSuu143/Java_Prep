package Java.L4_Pattern;

import java.util.*;

public class P6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            while(true) {
                System.out.print("Enter a number : ");
                n = sc.nextInt();
                if(n%2==0 || n<3) {
                    System.out.println("Enter a number which is neither even and less than 3 : ");
                } else {
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<n; j++) {
                            if(i==0 || j==0 || i==n-1 || j==n-1) {
            
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    // sc.close();
                }
            }
        }       
    }
}
