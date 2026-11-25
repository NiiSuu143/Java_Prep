import java.util.*;
public class ConnectNRopes {
    public static void connectRopes_minCost(int N, int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            pq.add(arr[i]);
        }

        int res = 0;
        while(pq.size() > 1) {
            int rope1 = pq.remove();
            int rope2 = pq.remove();
            res += rope1 + rope2;
            pq.add(rope1 + rope2);
        }

        System.out.println("Result "+res);
    }
    public static void main(String[] args) {
        /*******
         * Connect N ropes with minimum cost
         * *******/
        int N = 4;  // N ropes with different length
        int[] arr = {4, 3, 2, 6};   // the cost of rope

        connectRopes_minCost(N, arr);
    }
}
