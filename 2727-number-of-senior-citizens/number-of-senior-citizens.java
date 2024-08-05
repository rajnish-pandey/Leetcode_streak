class Solution {
    public int countSeniors(String[] details) {
        int i = 0;
        int result = 0;
        while(i < details.length) {
            int age = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');
            System.out.println(age);
            if(age > 60) {
                result++;
            }
            i++;
        }
        return result;
    }
}