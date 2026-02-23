package Java.L4_Pattern;

import java.util.*;

public class P7 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n;
            while(true) {
                System.out.print("Enter a number : ");
                n = sc.nextInt();
                if(n%2==0 || n<3) {
                    System.out.println("Enter a number other than 0 & less than 3 : ");
                } else {
                    for(int i=0; i<n; i++) {
                        for(int j=n-1; j>i; j--) {
                            System.out.print(" ");
                        }
                        for(int k=0; k<i+1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
