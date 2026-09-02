package Java.L5_Function;
import java.util.*;

public class PrimeRange {

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if(num <= 1) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0) {
            return false;
        }

        for(int i = 3; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void range(int num1, int num2) {
        for(int i = num1; i<= num2; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to print all the primes in a range : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println();
        range(num1, num2);
       
        sc.close();
    }
}
