class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int count =0;
        int[] seen = new int[128];
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            seen[ch]++;
            while(seen[ch]>1){
                seen[s.charAt(left)]--;
                left++;
            }
            count = Math.max(count,right-left+1);

        }return count;
    }
}