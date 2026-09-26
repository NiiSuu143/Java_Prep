public class LastOccurence {
    public static int lastOccur(int[] arr, int key, int i) {
        // base case 
        if(i == arr.length-1) {
            return -1;
        }
        
        // looking forward first for last Occurence
        int isFound = lastOccur(arr, key, i+1);

        // check with self
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        System.out.println(lastOccur(arr, key, 0));
    }
}
