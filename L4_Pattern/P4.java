package Java.L4_Pattern;

import java.util.*;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 'A';
        System.out.print("Enter a num : ");
        n = sc.nextInt();
        for(char i=0; i<n; i++) {
            for(char j=0; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
