class Solution { 
    public String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c: chars) {
            if(c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}