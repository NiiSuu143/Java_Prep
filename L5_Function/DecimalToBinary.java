package Java.L5_Function;

import java.util.Scanner;

public class DecimalToBinary {

    public static void decToBin(int n) {
        int bin = 0;
        int pow = 0;
        int num = n;
        while(n>0) {
            int rem = n % 2;
            bin = bin + rem * (int)Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        System.out.println(bin+ " is the binary form of "+ num);
    }

    public static void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("Average = "+ avg);
    }

    public static void isEven(int n) {
        if(n%2 == 0) {
            System.out.println(n+ " is an even number.");
        } else {
            System.out.println(n+ " is not an even number.");
        }
    }

    public static void isPalindrome(int n) {
        int reverse = 0;
        int num = n;
        while(n>0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        if(num != reverse) {
            System.out.println(num+ " is not a palindrome number.");
        } else {
            System.out.println(num+ " is a palindrome number.");
        }
    }

    public static void sumOfDigit(int n) {
        int sum = 0;
        int num = n;
        while(n!=0) {
            int digit = n % 10;
            sum = sum + digit;
            n /= 10;
        }
        System.out.println("Sum of the digits of "+ num+ " is "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal no. to convert it to a binary no. : ");
        int num = sc.nextInt();
        decToBin(num);

        // average of three no.
        // average(3, 20, 25);

        // isEven
        // isEven(10);

        // palindrome no.
        // System.out.println("Enter a no. to check wheather it is a palindrome no. or not : ");
        // int num = sc.nextInt();
        // isPalindrome(num);

        // sum of digits
        // sumOfDigit(135);
        sc.close();
    }
}