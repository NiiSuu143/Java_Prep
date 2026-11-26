import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;
public class MaxOfAll_Subarray_Size_K {
    public static int[] maxOfAll(int N, int K, int[] arr) {
        Deque<Integer> dq = new LinkedList<>();

        int result[] = new int[N-K+1];
        int resIdx = 0;

        for(int i=0; i<N; i++) {
            // keeping window size within K -> remove indices outside the window
            while(!dq.isEmpty() && dq.peekFirst() <= i-K) {
                dq.removeFirst();
            }

            // maintaining monotonic stack -> decreasing in nature
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }

            // just add the current index to Deque
            dq.addLast(i);

            // finding max. and add to the new array
            if(i >= K-1) {
                result[resIdx++] = arr[dq.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        /*********
         * Maximum of all subarrays of size k
         * -> We have an array arr[] of size N and an integer K.
         * -> Find the maximum for each and every contiguous subarray of size K.
         * ********/
        int N = 9;
        int K = 3;
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        
        System.out.println(Arrays.toString(maxOfAll(N, K, arr)));

    }
}
