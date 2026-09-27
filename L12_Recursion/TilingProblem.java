public class TilingProblem {
    public static int tiling(int n) {   // 2 x n (floor size) ie. 2 is already known so take only n as parameter
        // base case
        if(n == 0 || n == 1) {
            return 1;
        }

        // kaam kya karna hai..?
        // vertical choice
        int fnm1 = tiling(n-1); // fnm1 -> f(n-1)
        // horizontal choice
        int fnm2 = tiling(n-2); // fnm1 -> f(n-2)

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
