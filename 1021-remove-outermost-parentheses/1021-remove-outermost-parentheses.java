class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for(int i =  0; i<s.length();i++){
            if(s.charAt(i) == '('){
                if(open >0){
                    sb.append('(');
                }
                open++;
            }
            else{
                open--;
                if(open>0){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}