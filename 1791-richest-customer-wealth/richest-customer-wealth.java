class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int m = accounts.length, n = accounts[0].length;
        for(int i = 0; i < m; i++){
            int currentWealth = 0;
            for(int j = 0; j < n; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth = (currentWealth > maxWealth) ? currentWealth : maxWealth;
        }
        return maxWealth;
    }
}