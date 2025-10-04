class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length, running_sum = nums[0];
        for(int i = 1; i < len; i++) {
            running_sum += nums[i];
            nums[i] = running_sum;
        }
        return nums;
    }
}