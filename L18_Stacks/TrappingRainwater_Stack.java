import java.util.Stack;

public class TrappingRainwater_Stack {
    /*************
     * Time complexity is O(n) 
     * Because the while part which is Stack part is O(1)
     * why O(1) -> every height push once in stack and pop from the stack at most once
     * ****************/ 
    public static int trappedWater(int arr[]) {
        // if there is less the 3 bar then there is no way to store rain water in it
        if(arr == null || arr.length < 3) {
            System.out.println("Need at least 3 bars to store rain water");
            return 0;
        }
        Stack<Integer> s = new Stack<>();
        int totalWater = 0;
        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[i] > arr[s.peek()]) {
                int buttom = s.pop();   // index of dip floor
    
                if(s.isEmpty()) {
                    break;  // no left wall to trap water
                }
    
                int left = s.peek();
                int waterLevel = Math.min(arr[left], arr[i]);
                int boundedHeight = waterLevel - arr[buttom];
                int width = i - left - 1;
                totalWater += boundedHeight * width;
            }   

            s.push(i);  // push current bar index to stack
        }
        
        return totalWater;
    }
    public static void main(String[] args) {
        int height[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(trappedWater(height));
    }
}
