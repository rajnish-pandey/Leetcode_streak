class Solution {
    public int findMax(int[] candies) {
        int max = candies[0];
        for(int i = 1; i < candies.length; i++) {
            if(max < candies[i]) {
                max = candies[i];
            }
        }
        return max;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) >= findMax(candies)) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}