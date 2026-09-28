public class PracticeRecursion {
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
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printIndexOccur(arr.length, arr, 0, 2);
    }
}
