// time complexity = O(2^n) but it can be optimized to O(n) by using dynamic programming
// space complexity = O(n)
public class Fibonacci {
    public static int fibo(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fn = fibo(n-1) + fibo(n-2);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
