package Java.L3_Loops;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fac = 1;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        for(int i = 1; i<= num; i++) {
            fac *= i;
        }
        System.out.println("Factorial of the "+num+" is "+fac);
        sc.close();
    }
}
