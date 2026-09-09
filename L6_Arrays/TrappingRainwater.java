package Java.L6_Arrays;

public class TrappingRainwater {
    public static void trapedWater(int height[]) {
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        maxLeft[0] = height[0];
        maxRight[height.length-1] = height[height.length-1];
        int trapedWater = 0;
        boolean isEqual = false;

        for(int i=0; i<height.length-1; i++) {
            if(height[i] == height[i+1]) {
                isEqual = true;
            } else {
                isEqual = false;
            }
        }
    
        if(height.length<=2) {
            System.out.println("Need at least three bar or boundaries to trap rainwater. So, input at least three bar heights.");
        }else if(isEqual == true) {
            System.out.println("If all the height of bars are equal then it cannot trap rainwater.");
        } else {
            for(int i=1; i<height.length; i++) {
               maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
            }
            for(int i=height.length-2; i>=0; i--) {
                maxRight[i] = Math.max(maxRight[i+1], height[i]);
            }
    
            // print auxiliary array
            for(int i=0; i<height.length; i++) {
                System.out.print(maxLeft[i]+" ");
            }
            System.out.println();
            for(int i=0; i<height.length; i++) {
                System.out.print(maxRight[i]+" ");
            }
            System.out.println();
    
            // min(maxLeft,maxRight) - height = trapedWater
            for(int i=0; i<height.length; i++) {
                int waterLevel = Math.min(maxLeft[i], maxRight[i]);
        
                trapedWater += waterLevel-height[i];
            }
            System.out.println("Total trapedRainwater = "+ trapedWater);
        }

    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        // int height[] = {3, 4};
        // int height[] = {1, 2, 3, 4, 5, 6, 4};
        trapedWater(height);
    }
}
