public class QuickSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int pivotIdx = partition(arr, si, ei);

        quickSort(arr, si, pivotIdx - 1); // left part
        quickSort(arr, pivotIdx + 1, ei); // right part
    }

    public static int partition(int[] arr, int si, int ei) {
        // partion
        int pivot = arr[ei];
        int i = si - 1; // i = -1;

        for(int j=si; j<ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // move pivot to its correct final place
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
