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
    
    public static int numCount(int[] nums, int num, int si, int ei) {
        int count = 0;
        for(int i=si; i<ei; i++) {
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int newMajorityElement(int[] nums, int si, int ei) {
        // base case
        if(si == ei) {
            return nums[si];
        }

        // kaam
        int mid = si+(ei-si)/2;
        int left = newMajorityElement(nums, si, mid);
        int right = newMajorityElement(nums, mid+1, ei);

        // if the two halves agree on the majority element, return it.
        if(left == right) {
            return left;
        }

        int leftCount = numCount(nums, left, si, ei);
        int rightCount = numCount(nums, right, si, ei);

        return  leftCount > rightCount ? left : right;
    }
    public static void main(String[] args) {
        // Practice question 2 -> Given an array nums of size n, return the majority element.
        // The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
        // int[] nums = {3, 4, 3};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        // System.out.println(searchMajority(nums));
        System.out.println(newMajorityElement(nums, 0, nums.length-1));
    }
}
