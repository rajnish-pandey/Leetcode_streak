class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String shortest = strs[0];
        String longest = strs[strs.length - 1];
        for(int i = 0; i < shortest.length(); i++) {
            if(shortest.charAt(i) == longest.charAt(i)) {
                ans += shortest.charAt(i);
            }
            else {
                break;
            }
        }
        return ans;
    }
}