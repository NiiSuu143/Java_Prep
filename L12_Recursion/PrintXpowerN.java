public class PrintXpowerN {
    public static int optimizedPower(int x, int n) {
        // base case
        if(n == 0) {
            return 1;
        }
        /**************
         * In this part we thought it's time complexity is O(logn) 
         * but it is O(n) because, `optimizedPower(x, n/2)` is doing two times
         * Instead of doing this two times,
         * we should assign it to a variable and find sq. of it as these two is exactly same
         * it will difinitely bring the time complexity down to O(logn)
         * ***************/ 
        // int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);


        // this is real O(logn)
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n%2 != 0) {
            return x * halfPowerSq;
        }
        return halfPowerSq;

        // if(n%2 == 0) {
        //     return optimizedPower(x, n/2) * optimizedPower(x, n/2);
        // } else {
        //     return x * optimizedPower(x, n/2) * optimizedPower(x, n/2);
        // }
    }

    public static int power(int x, int n) {
        // base case 
        if(n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        // time complexity -> O(n)
        // System.out.println(power(2, 10));

        // time complexity -> O(logn)
        System.out.println(optimizedPower(2, 5));
    }
}
