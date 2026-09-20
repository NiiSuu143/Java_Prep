package Java.L10_Bit_Manipulation;

public class OperationsOfBIt {
    public static int get_ith_bit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set_ith_bit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clear_ith_bit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int update_ith_bit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clear_ith_bit(n, i);
        // } else {
        //     return set_ith_bit(n, i);
        // }

        // other logic
        n = clear_ith_bit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int last_ith_bit_clear(int n, int i) {
        int bitMask = (-1)<<i;  // or bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        // System.out.println(get_ith_bit(15, 2));
        // System.out.println(set_ith_bit(10, 2));
        // System.out.println(clear_ith_bit(10, 1));
        // System.out.println(update_ith_bit(10, 2, 1));
        System.out.println(last_ith_bit_clear(15, 2));
    }
}
