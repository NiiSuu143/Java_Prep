public class MajorityElement {
    public static int searchMajority(int[] nums) {
        int majorityCount = nums.length/2;
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count+=1;
                }
            }
            if(count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Practice question 2 -> Given an array nums of size n, return the majority element.
        // The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
        // int[] nums = {3, 4, 3};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(searchMajority(nums));
    }
}
