class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> answer0 = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        for(int num1: nums1) {
            boolean found = false;
            for(int num2: nums2) {
                if(num1 == num2) {
                    found = true;
                    break;
                }
            }
            if(!found && !answer0.contains(num1)) {
                answer0.add(num1);
            }
        }

        for(int num2: nums2) {
            boolean found = false;
            for(int num1: nums1) {
                if(num2 == num1) {
                    found = true;
                    break;
                }
            }
            if(!found && !answer1.contains(num2)) {
                answer1.add(num2);
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(answer0);
        result.add(answer1);
        return result;
    }
}