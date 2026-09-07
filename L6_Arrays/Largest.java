package Java.L6_Arrays;

// import java.util.*;
public class Largest {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]>largest) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }  
        System.out.println(smallest+ " is the smallest number.");
        return largest;
    }    
    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 5};
        int largest = getLargest(numbers);
        System.out.println(largest+ " is the largest number.");
    }
}
