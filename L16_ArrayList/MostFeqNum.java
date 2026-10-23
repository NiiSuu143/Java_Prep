import java.util.ArrayList;

public class MostFeqNum {
    public static int most_feq_num(ArrayList<Integer> nums , int key) {
        int[] count = new int[1001];    // Must be 1001 so index 1000 exists
        for(int i=0; i<nums.size()-1; i++) {
            if(nums.get(i) == key) {
                int target = nums.get(i+1);
                count[target]++;    // Direct: target 100 goes to index 100
            }
        }

        // find max one
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                ans = i;    // Direct: index IS the target value
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key = 1;
        System.out.println(most_feq_num(nums, key));

    }
}
