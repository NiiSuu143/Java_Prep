import java.util.*;

public class NextGreaterElement {
    // Brute force approach -> Time complexity = O(n^2)
    public static void getNextGreater(int arr[], int nextGreat[]) {
        int max = Integer.MIN_VALUE;
        // Nested loop
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                nextGreat[i] = -1;
                break;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = Math.max(max, arr[j]);
                    break;
                } else {
                    max = -1;
                }
            }
            nextGreat[i] = max;
        }
    }

    /***************
     * By using Stack -> O(n)
     * Optimized next greater element
     ***************/
    public static void optimizedNextGreater(int arr[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            // step 1
            // while (!s.isEmpty()) {
            //     if (arr[s.peek()] <= arr[i]) {
            //         s.pop();
            //     } else { 
            //         break;   // we should end the loop
            //     }
            // }
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // step 2
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()]; // always put index of array
            }

            // step 3 -> push in stack
            s.push(i);
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];

        printArr(arr);
        // getNextGreater(arr, nextGreater);
        optimizedNextGreater(arr, nextGreater);

        printArr(nextGreater);
    }
}
