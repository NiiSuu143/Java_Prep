public class IncreasingOrder {
    public static void printInc(int n) {
        // Base case should be initialized
        if(n == 1) {
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}