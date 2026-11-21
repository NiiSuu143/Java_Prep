import java.util.Stack;

public class TrappingRainwater {
    public static int trappedWater(int arr[]) {
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

            s.push(i);
        }
        
        return totalWater;
    }
    public static void main(String[] args) {
        int height[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(trappedWater(height));
    }
}
