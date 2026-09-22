
import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
    public static void printSort(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 2, 3 };
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);

        Integer arr[] = { 5, 4, 1, 3, 2};  //need to change from int to Integer
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printSort(arr);
    }
}
