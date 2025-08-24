class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // first element is always 1
            row.add(1);
            // middle elements = sum of two above
            for (int j = 1; j < i; j++) {
                int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(val);
            }
            // last element is always 1 (except first row)
            if (i > 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}
