package Java.L6_Arrays;

public class PracticeArray {
    public static int sellBuyStocks(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0; i<price.length; i++) {
            if(buyprice<price[i]) {
                int profit = (price[i]-buyprice);
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyprice = price[i];
            }
        }
        if(buyprice == price[price.length-1]) {
            return 0;
        }
        return maxProfit;
    }
    public static boolean isDistinctArray(int arr[]) {
        boolean isDistinct = false;
        for (int i = 0; i < arr.length; i++) {
            int firstNum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (firstNum == arr[j]) {
                    isDistinct = true;
                    return isDistinct;
                } else {
                    isDistinct = false;
                }
                System.out.println(j + " " + isDistinct);
            }
        }
        return isDistinct;
    }

    public static int rotatedArray(int arr[], int num) {
        int target = num;
        int start = 0;
        int end = arr.length - 1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            // check if left half is normal
            if(arr[start] < arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid-1;    // search to left
                } else  {
                    start = mid+1;  // search to right
                }
            // check if right half is normal
            } else {
                if(arr[mid] <= target && target <= arr[end]) {
                    start = mid+1;  // search to left
                } else {
                    end = mid-1;    // seach to right
                }
            }

        }
        return -1;
    }

    public static int traped_rainwater(int barLevel[]) {
        int trapedWater = 0;
        // int waterLevel = 0;
        int maxRight[] = new int[barLevel.length];
        int maxLeft[] = new int[barLevel.length];
        maxRight[0] = barLevel[0];
        maxLeft[barLevel.length-1] = barLevel[barLevel.length-1];
        // finding the right max barlevel
        for(int i=1; i<barLevel.length; i++) {
            maxRight[i] = Math.max(maxRight[i-1], barLevel[i]);
        }
        // finding the left max barlevel
        for(int i=barLevel.length-2; i>=0; i--) {
            maxLeft[i] = Math.max(maxLeft[i+1], barLevel[i]);
        }


        for(int i=0; i<barLevel.length; i++) {
            System.out.print(maxRight[i]);
        }
        System.out.println();
        for(int i=0; i<barLevel.length; i++) {
            System.out.print(maxLeft[i]);
        }
        System.out.println();

        for(int i=0; i<barLevel.length; i++) {
            int waterLevel = 0;
            waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trapedWater += waterLevel - barLevel[i];
        }
        return trapedWater;
    }

    public static void main(String args[]) {
        // 1st question -> check wheather an array has distinct element or not
        // int arr[] = {1, 2, 3, 1};
        // int arr[] = {1, 2, 3, 4};
        // int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // boolean isDistinct = isDistinctArray(arr);
        // System.out.println(isDistinct);

        // 2nd -> random rotational array
        // int arr[] = {4, 5, 6, 7, 0, 1, 2 };
        // int arr[] = {6, 7, 0, 1, 2, 4, 5};
        // int arr[] = {2, 4, 5, 6, 7, 0, 1};
        // System.out.println(rotatedArray(arr, 7));

        // 3rd -> sell & buy stocks
        // int price[] = {7, 1, 5, 3, 6, 4};
        // int price[] = {7, 6, 4, 3, 1};
        // System.out.println("Profit = "+sellBuyStocks(price));

        // 4th -> traping rainwater problem
        int barLevel[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Traped Rainwater = "+traped_rainwater(barLevel));
    }
}
