package Java.L6_Arrays;

public class PracticeArray {
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
            if((mid+1)<(mid+2)) {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid+1;
                } else  {
                    end = mid-1;
                }
            } else {
                return 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        // 1st question
        // int arr[] = {1, 2, 3, 1};
        // int arr[] = {1, 2, 3, 4};
        // int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // boolean isDistinct = isDistinctArray(arr);
        // System.out.println(isDistinct);

        // 2nd
        int arr[] = { 0, 1, 2, 4, 5, 6, 7 };
        System.out.println(rotatedArray(arr, 6));
    }
}
