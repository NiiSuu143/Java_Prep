package Java.L7_Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length-1; i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to inser
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void printSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 2, 3 };
        // insertion(arr);
        // printSort(arr);


        // Arrays.sort(arr);
        Arrays.sort(arr, 0, 3);
        printSort(arr);
    }
}
