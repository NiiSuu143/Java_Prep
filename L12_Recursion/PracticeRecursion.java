public class PracticeRecursion {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int n) {
        // base case
        if(n == 0) {
            return ;
        }
        // kaam
        int lastDigit = n % 10;
        printDigits(n / 10);

        System.out.print(digits[lastDigit]+ " ");
    }


    public static void printIndexOccur(int n, int[] arr, int i, int key) {
        // base case
        if(n == 0) {
            return;
        }
        // kaam
        if(arr[i] == key) {
            System.out.print(i+ " ");
        }
        printIndexOccur(n-1, arr, i+1, key);
    }
    public static void main(String[] args) {
        // // 1st Question -> find all the occurence indices of a given element key and print them using recursion
        // int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // printIndexOccur(arr.length, arr, 0, 2);


        /**********
         * 2nd Question -> 
         * You are given a number (eg - 2019), convert it into a String of english like
         * “two zero one nine”. Use a recursive function to solve this problem.
         * NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
         * 
         * Sample Input : 1947
         * Sample Output : “one nine four seven”
         * **********/ 
        printDigits(1234);
    }
}
