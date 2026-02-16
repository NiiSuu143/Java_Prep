package Java.L3_Loops;

import java.util.*;

public class ReversedNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, reverse=0;
        System.out.print("Enter a num : ");
        num = sc.nextInt();
        while(num>0) {
            int lastDigit = num%10;
            reverse = (reverse*10)+lastDigit;
            num = num/10;
        }
        System.out.println("Your Reversed num : "+reverse);

        sc.close();
    }
}
