public class InversionCount {

    public static int inversionCount(int[] arr) {
        
        // inversion main logic
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i]>arr[j] && i<j) {
                    count+=1;
                }
            }    
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {5, 5, 5};
        System.out.println(inversionCount(arr));
    }
}
