class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] str = s.toCharArray();
        int start =0;
        int end =str.length -1;
        while(start<end){
            if(!Character.isLetterOrDigit(str[start])){
                start++;
            }
            else if(!Character.isLetterOrDigit(str[end])){
            end--;
            }
            else{
                if(str[end] != str[start]){
                    return false;
                }
                end--;
                start++;
            }
        }
        return true;
    }
}