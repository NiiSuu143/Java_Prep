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
                System.out.println(" --> Sum = "+sumOfsub );
                // max amoung sum of subarrays
                if(largest<sumOfsub) {
                    largest = sumOfsub;
                }
            }
        }
        System.out.println(largest+ " is the largest sum.");
    }

    public static void optimizedMaxSubarray(int arr[]) {
         // print subarray -> max. sum
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                int sumOfsub = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.println(" --> Sum = "+sumOfsub );
                // max amoung sum of subarrays
                if(largest<sumOfsub) {
                    largest = sumOfsub;
                }
            }
        }
        System.out.println(largest+ " is the largest sum.");
    }

    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        boolean isNegative = true;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>0) {
                isNegative = false;
                break;
            } 
        }
        if(isNegative == true) {
            for(int i=0; i<arr.length; i++) {
                currSum += arr[i];
                System.out.print("CurrSum = "+currSum);

                maxSum = Math.max(currSum, maxSum);

                System.out.print("  ----> MaxSum = "+ maxSum);
                System.out.println();
            }
            System.out.println("Max sum of subarray = "+maxSum);
        } else {
            for(int i=0; i<arr.length; i++) {
                currSum += arr[i];
                if(currSum<0) {
                    currSum = 0;
                }
                System.out.print("CurrSum = "+currSum);
    
                maxSum = Math.max(currSum, maxSum);
    
                System.out.print("  ----> MaxSum = "+ maxSum);
                System.out.println();
            }
            System.out.println("Max sum of subarray = "+maxSum);
        }
    }


    public static void main(String[] args) {
        // int arr[] = {2, 4, 6, 8, 10};
        // printSubarray(arr);
        // maxSubarray(arr);
        // int arr[] = {1, -2, 6, -1, 3};
        // optimizedMaxSubarray(arr);
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int arr[] = {-1, -2, -3, -4};
        kadanes(arr);
    }
}
