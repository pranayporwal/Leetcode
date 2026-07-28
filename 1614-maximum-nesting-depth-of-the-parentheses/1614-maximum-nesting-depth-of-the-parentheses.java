class Solution {
    public int maxDepth(String s) {
       int open =0;
       int max = 0;
       for(int i =0; i<s.length();i++){
        char ch = s.charAt(i);
        if(ch == '('){
            open++;
            max = Math.max(max,open);
        }
        else if(ch ==')' ){
            open--;
        }
       } return max; 
    }
}