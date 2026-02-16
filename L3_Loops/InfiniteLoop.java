package Java.L3_Loops;

import java.util.*;

public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number = ");
            int num = sc.nextInt();
            if(num == 0) {
                System.out.println("Enter another number other than 0");
                continue;
            }
            if(num % 10 == 0) {
                break;
            }
            System.out.println("Number : "+num);
        }
        sc.close();
    }
}
