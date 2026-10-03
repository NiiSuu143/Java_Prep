public class InversionCount {

    public static int inversionCount(int[] arr) {

        // inversion main logic
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j] && i < j) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static int merge(int[] arr, int si, int mid, int ei) {
        int i = si;
        int j = mid;
        int k = 0;
        int invCount = 0;

        int[] temp = new int[ei-si+1];

        while(i<mid && j<=ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                invCount += (mid-i);
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // leftover left
        while(i<mid) {
            temp[k++] = arr[i++];
        }

        // leftover right
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        for(i=si, k=0; i<=ei; i++, k++) {
            arr[i] = temp[k];
        }
        
        return invCount;
    }

    public static int mergeSort(int[] arr, int si, int ei) {
        int inversionCount = 0;
        if (ei > si) {
            int mid = si + (ei - si) / 2;
            inversionCount = mergeSort(arr, si, mid);
            inversionCount += mergeSort(arr, mid + 1, ei);
            inversionCount += merge(arr, si, mid + 1, ei);
        }
        return inversionCount;
    }

    public static int getInversion(int[] arr) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {5, 5, 5};
        // System.out.println(inversionCount(arr));
        System.out.println(getInversion(arr));
    }
}
