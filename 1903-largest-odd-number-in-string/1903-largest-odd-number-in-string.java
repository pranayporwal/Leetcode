class Solution {
    public String largestOddNumber(String num) {
        int index = -1;
        int n = num.length();
        char[] str = num.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            if (str[i] % 2 != 0) {
                index = i;
                break;
            }
        }
        if(index == -1){
            return "";
        }
        return num.substring(0, index + 1);
    }
}