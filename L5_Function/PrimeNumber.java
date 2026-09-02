package Java.L5_Function;
import java.util.*;

public class PrimeNumber {

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
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to check wheather it is prime or not : ");
        int num = sc.nextInt();
        
        if(isPrime(num) == false) {
            System.out.println(num+ " is not a prime number.");
        } else {
            System.out.println(num+ " is a prime number.");
        }
        sc.close();
    }
}
