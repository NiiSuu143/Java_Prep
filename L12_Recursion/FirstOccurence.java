public class FirstOccurence {
    public static int firstOccur(int[] arr, int i, int key) {
        // Base case
        if(i == arr.length-1) {
            return -1;
        }
        
        if(arr[i] == key) {
            return i;
        }
        return firstOccur(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        System.out.println(firstOccur(arr, 0, key));
    }
}
