public class OptimizedGrid {
    public static int fact(int n) {
        // base case
        if(n == 0) {
            return 1;
        }
        // recursion
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalWays = (fact(n-1+m-1)) / (fact(n-1)*fact(m-1));
        // System.out.println(fact(n));
        System.out.println("No. of ways = "+totalWays);
    }
}
