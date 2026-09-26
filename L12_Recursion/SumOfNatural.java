public class SumOfNatural {
    public static int sumOfN(int n) {
        if(n == 1) {
            return 1;
        }
        int sum = n + sumOfN(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first "+n+ " natural no. = "+sumOfN(n));
    }
}
