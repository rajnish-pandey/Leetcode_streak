class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int []sum = new int[n];
        int currentSum = 0;
        for(int i = 0; i < n; i++) {
            currentSum += nums[i];
            sum[i] = currentSum;
        }
        return sum;
    }
}