class Solution {
    public void shiftRight(int []arr, int i) {
        int n = arr.length;
        for(int j = n - 1; j > i; j--) {
            arr[j] = arr[j - 1];
        }
    }
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == 0) {
                shiftRight(arr, i);
                i++;
            }
        }
    }
}