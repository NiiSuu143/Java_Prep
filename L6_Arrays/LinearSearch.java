package Java.L6_Arrays;

public class LinearSearch {

    public static int linearSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }     
        }
        return -1; 
            
        }
        public static void main(String[] args) {
            int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
            // String menu[] = {"dosa", "chole bhature", "samosa" ..}
            int key = 10;
            int index = linearSearch(arr, key);
            if(index == -1) {
                System.out.println("NOT FOUND!");
            } else {
                System.out.println(key +" is found in the index "+ index);
            } 
    }
}
