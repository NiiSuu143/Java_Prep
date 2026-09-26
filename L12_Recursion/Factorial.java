public class Factorial {
    public static int printFac(int n) {
        if(n == 0) {
            return 1;
        }
        int fac = n * printFac(n-1);
        return fac;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial = "+ printFac(n));
    }
}
