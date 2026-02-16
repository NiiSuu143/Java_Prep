package Java.L3_Loops;

import java.util.*;

public class WhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while(counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // print 1 to n
        int n, i = 1, sum = 0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        System.out.println("Your number : ");
        while(i <= n) {
            System.out.println(i);
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of numbers = "+sum);

        sc.close();
    }
}
