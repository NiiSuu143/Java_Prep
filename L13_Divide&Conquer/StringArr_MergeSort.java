public class StringArr_MergeSort {
    public static void printArr(String[] str) {
        for(int i=0; i<str.length; i++) {
            System.out.print(str[i]+ " ");
        }
        System.out.println();
    }

    public static void mergeSort(String[] str, int si, int ei) {
        // base case
        if(si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si)/2;
        // left part
        mergeSort(str, si, mid);
        // right part
        mergeSort(str, mid+1, ei);

        merge(str, si, mid, ei);
    }

    public static void merge(String[] str, int si, int mid, int ei) {
        String[] strTemp = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei) {
            if(str[i].charAt(0) < str[j].charAt(0)) {
                strTemp[k] = str[i];
                i++;
            } else {
                strTemp[k] = str[j];
                j++;
            }
            k++;
        }

        // for leftover of left
        while(i<=mid) {
            strTemp[k++] = str[i++];
        }
        // for leftover of right
        while(j<=ei) {
            strTemp[k++] = str[j++];
        }

        // copy temp to original arr
        for(k=0, i=si; k<strTemp.length; k++, i++) {
            str[i] = strTemp[k];
        }
    }
    public static void main(String[] args) {
        String[] str = {"sun", "earth", "mars", "mercury"};
        mergeSort(str, 0, str.length-1);
        printArr(str);
    }
}
