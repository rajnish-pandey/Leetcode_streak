class Solution {
    public static int noOfDigits(int num) {
        int i = 0;
        while(num != 0) {
            i += 1;
            num = num / 10;
        }
        return i;
    }
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int num: nums) {
            if(noOfDigits(num) % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}