public class TowerOfHanoi {
    public static void towerShift(int n, String src, String helper, String dest) {
        // base case
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return ;
        }
        // kaam
        towerShift(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerShift(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerShift(n, "A", "B", "C");
    }
}
