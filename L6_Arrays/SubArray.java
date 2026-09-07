package Java.L6_Arrays;

public class SubArray {
    public static void printSubarray(int arr[]) {
        int ts=0;
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) { // print
                    System.out.print(arr[k]+" ");   // subarrays
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+ts);
    }

    public static void maxSubarray(int arr[]) {
         // print subarray -> max. sum
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                int sumOfsub = 0;
                for(int k=start; k<=end; k++) {
                    sumOfsub += arr[k];
                }
                // System.out.print(" --> Sum = "+sumOfsub );
                // max amoung sum of subarrays
                if(largest<sumOfsub) {
                    largest = sumOfsub;
                }
            }
        }
        System.out.println(largest+ " is the largest sum.");
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubarray(arr);
        maxSubarray(arr);
    }
}
