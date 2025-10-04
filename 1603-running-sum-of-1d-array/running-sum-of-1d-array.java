class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length, running_sum = 0;
        int[] ans = new int[len];
        for(int i = 0; i < len; i++) {
            running_sum += nums[i];
            ans[i] = running_sum;
        }
        return ans;
    }
}