package Java.L4_Pattern;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a num : ");
        num = sc.nextInt();
        for(int i = 0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
