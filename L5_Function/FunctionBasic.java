package Java.L5_Function;
import java.util.*;

public class FunctionBasic {
    public static int king() {
        System.out.println("King of kings");
        return 3;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {    // public static -> access modifier, void -> return type 
        //body 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is: " + sum);
        sc.close();
    }
} 
 