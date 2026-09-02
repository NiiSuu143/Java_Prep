package Java.L5_Function;

public class BinomialCoefficient {

    public static int factorial(int num) {
        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    public static int binomial(int n, int r) {
        int result = factorial(n)/(factorial(r)*(factorial(n-r)));
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        // System.out.println(factorial(n));
        int combination = binomial(n, r);
        System.out.println(n+ " C "+r +" is "+ combination);
    }
}
