package Java.L7_Sorting;

public class Practice_Sort {
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[min]<arr[j]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }

        int countArray[] = new int[max+1];
        for(int i=0; i<arr.length; i++) {
            countArray[arr[i]]++;
        }

        // sorting
        int j = arr.length-1;
        for(int i=0; i<countArray.length; i++) {
            while(countArray[i]>0) {
                arr[j] = i;
                j--;
                countArray[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // 1st Question -> Decending Bubble sort
        // int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // printArray(arr);

        // 2nd Question -> Decending selection sort
        // int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // selectionSort(arr);
        // printArray(arr);
        
        // 3rd Question -> Decending insertion sort
        // int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // insertionSort(arr);
        // printArray(arr);

        // 4th Question -> Decendieng counting sort
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        printArray(arr);
    }
}
