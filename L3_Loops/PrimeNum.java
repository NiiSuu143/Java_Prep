package Java.L3_Loops;

import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 2) {
            System.out.println(n+" is not a prime number.");
        } else if(n == 2) {
            System.out.println("2 is prime number.");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                }
            }
    
            if(isPrime == true) {
                System.out.println(n+" is prime number.");
            } else {
                System.out.println(n+" is not a prime number.");
            }

        }

        sc.close();
    }
}
