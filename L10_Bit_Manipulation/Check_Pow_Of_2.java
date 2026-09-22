

public class Check_Pow_Of_2 {
    public static void checkPowOf2(int n) {
        int bitMask = n-1;
        if((n & bitMask) == 0) {
            System.out.println(n+ " is a power of 2.");
        } else {
            System.out.println(n+ " is not a power of 2.");
        }
    }
    public static void main(String[] args) {
        checkPowOf2(4);
        checkPowOf2(9);
    }
}
