

public class BubbleSort {
    

    public static void optimizedBubbleSorting(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            boolean swap = false;
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                System.out.println("Array is already sorted.");
                break;
            }
        }
        printSort(arr);
    }
    public static void bubleSorting(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]) {
        // int arr[] = {5, 4, 1, 3, 2};
        // bubleSorting(arr);
        // printSort(arr);

        // for optimized bubble sort
        int arr[] = {1, 2, 3, 4, 5};
        optimizedBubbleSorting(arr);
    }
}
