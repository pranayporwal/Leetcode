class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max_length =0,length =0;
        int[] seen = new int[128];
        for(int i =0;i<s.length();i++){
            char ch  = s.charAt(i);
            left=Math.max(left,seen[ch]);
            seen[ch] = i+1;
            length = i-left+1;
            max_length = Math.max(length,max_length);
        }
        return max_length;
    }
}