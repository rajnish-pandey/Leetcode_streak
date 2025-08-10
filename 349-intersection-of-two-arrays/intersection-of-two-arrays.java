class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> commonSet = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if(nums1[p1] == nums2[p2]) {
                commonSet.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2]) {
                p1++;
            }
            else {
                p2++;
            }
        }
        p1 = 0;
        int []ans = new int[commonSet.size()];
        for(int x: commonSet) {
            ans[p1++] = x;
        }
        return ans;
    }
}