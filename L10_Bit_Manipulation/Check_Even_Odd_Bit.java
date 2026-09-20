package Java.L10_Bit_Manipulation;

public class Check_Even_Odd_Bit {
    public static void oddOrEven(int n) {
        int bitMask = 1;

        if((n & bitMask) == 0) {
            // even no.
            System.out.println(n+ " is even.");
        } else {
            System.out.println(n+ " is odd.");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }
}
