class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force
        // int n=nums.length;
        // int []ans=new int[2];
        // for(int i=0; i<n-1; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         if(nums[i]+nums[j]==target) {
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }
        // return ans;

        // Optimized approach O(n)
        int n = nums.length;
        HashMap<Integer, Integer> numMap = new HashMap<> ();
        int ans[] = new int[2];
        for(int i=0; i<n; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement)) {
                ans[0] = numMap.get(complement);
                ans[1] = i;
                return ans; 
            }
            numMap.put(nums[i], i);
        }
        return ans;
    }
}