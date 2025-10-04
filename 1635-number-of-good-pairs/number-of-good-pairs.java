class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        
        // Brute Force Approach
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = 0; j < nums.length; j++) {
        //         if((i < j) && (nums[i] == nums[j])) {
        //             ans += 1;
        //         }
        //     }
        // }

        // using HashMap
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: nums) {
            ans += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        return ans;
    }
}
