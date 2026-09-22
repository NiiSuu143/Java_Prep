package Java.L10_Bit_Manipulation;

public class Practice_Bit_Manipulation {
    public static void swapNum(int a, int b) {
        int x = a, y = b;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void add_1_toInt(int n1, int n2, int n3) {
        // for positive numbers
        System.out.println(n1+ " + 1 is "+ -(~n1));

        // for negative numbers
        System.out.println(n2+ " + 1 is "+ -(~n2));

        // for 0
        System.out.println(n3+ " + 1 is "+ -(~n3));
    }
    public static void main(String[] args) {
        // 1st Question -> What is the value of x^x for any value of x ?
        // ----> By XOR rule, the x^x is 0 for any value of x


        // 2nd Question -> Swap two numbers without using any third variable
        // swapNum(5, 3);


        // 3rd Question -> Add 1 to an integer using Bit Manipulation (Hint: using Bitwise NOT operator)
        add_1_toInt(6, -4, 0);

        
        // Convert uppercase characters to lowercase using bits (Tricky one)
        
    }
}
