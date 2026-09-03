package Java.L5_Function;
import java.util.*;

public class BinaryToDecimal {

    public static void binToDec(int n) {
        int decimal = 0;
        int power = 0;
        while(n!=0) {
           int lastDigit =  n % 10;
           decimal = decimal + lastDigit * (int)Math.pow(2, power);
           power++;
           n = n / 10;
        }
        System.out.println("Decimal is "+decimal);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary no. to covert it to a decimal no. : ");
        int num = sc.nextInt();
        binToDec(num);
        sc.close();
    }
}
