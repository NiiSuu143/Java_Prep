public class Practice {
    public static void main(String[] args) {
        /***************
         * Some practice questions...
         * ****************/
        // Time complexity of this loop is O(logkn) where k is the base of log
        int k=5;
        for(int i=0; i<100; i++) {
            System.out.println(i);
            i*=k;
        }
    }
}
