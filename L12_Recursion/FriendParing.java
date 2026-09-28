public class FriendParing {
    public static int pairingFrnd(int n) {
        // Base case
        if(n == 1 || n == 2) {
            return n;
        }
        // kaam
        // single
        int fnm1 = pairingFrnd(n-1);
        // paired
        int fnm2 = pairingFrnd(n-2);
        int pairWays = (n-1) * fnm2;

        int totWays = fnm1 + pairWays;
        return totWays;

        // return pairingFrnd(n-1) + (n-1) * pairingFrnd(n-2);
    }
    public static void main(String[] args) {
       System.out.println(pairingFrnd(3));
    }
}
