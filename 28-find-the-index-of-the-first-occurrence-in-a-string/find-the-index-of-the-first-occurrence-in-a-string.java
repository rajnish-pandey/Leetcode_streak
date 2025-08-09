class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        for(int i = 0; i <= haystackLen - needleLen; i++) {
            if(needle.equals(haystack.substring(i, i + needleLen))) {
                return i;
            }
        }
        return ans;
    }
}