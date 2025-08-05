class Solution {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length();
        int hLen = haystack.length();
        boolean found = false;
        if((nLen == 0) || (nLen > hLen)) {
            return -1;
        }
        for(int i = 0; i <= hLen - nLen; i++) {
            // int j = 0;
            // while(j < nLen && (haystack.charAt(i + j)) == needle.charAt(j)) {
            //     j++;
            // }
            // if(j == nLen) {
            //     return i;
            // }
            if(haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}