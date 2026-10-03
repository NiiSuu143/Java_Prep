public class StringArr_MergeSort {
    public static void printArr(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String[] str, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        // left part
        mergeSort(str, si, mid);
        // right part
        mergeSort(str, mid + 1, ei);

        merge(str, si, mid, ei);
    }

    public static void merge(String[] str, int si, int mid, int ei) {
        String[] strTemp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (str[i].charAt(0) < str[j].charAt(0)) {
                strTemp[k] = str[i];
                i++;
            } else {
                strTemp[k] = str[j];
                j++;
            }
            k++;
        }

        // for leftover of left
        while (i <= mid) {
            strTemp[k++] = str[i++];
        }
        // for leftover of right
        while (j <= ei) {
            strTemp[k++] = str[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < strTemp.length; k++, i++) {
            str[i] = strTemp[k];
        }
    }

    public static String[] newMergeSort(String[] arr, int si, int ei) {
        // base case
        if (si == ei) {
            String[] A = { arr[si] };
            return A;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        String[] arr1 = newMergeSort(arr, si, mid);
        String[] arr2 = newMergeSort(arr, mid + 1, ei);

        String[] arr3 = newMerge(arr1, arr2);
        return arr3;
    }

    public static String[] newMerge(String[] arr1, String[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        String[] arr3 = new String[n + m];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < n && j < m) {
            if (isAlphabaticallySmaller(arr1[i], arr2[j]) == true) {
                arr3[idx] = arr1[i];
                i++;
            } else {
                arr3[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        // leftover element of left arr
        while (i < n) {
            arr3[idx++] = arr1[i++];
        }

        // leftover element of right arr
        while (j < m) {
            arr3[idx++] = arr2[j++];
        }

        return arr3;
    }

    public static boolean isAlphabaticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Practice Question 1 -> Apply Merge sort to sort an array of Strings. (Assume
        // that all the characters in all the Strings are in lowercase).
        String[] str = { "sun", "earth", "mars", "mercury" };
        // mergeSort(str, 0, str.length-1);
        str = newMergeSort(str, 0, str.length - 1);
        printArr(str);
    }
}
