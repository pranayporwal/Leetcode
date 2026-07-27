class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;

        if (s.length() == 0)
            return true;

        for (char ch : t.toCharArray()) {
            if (start < s.length() && s.charAt(start) == ch) {
                start++;
            }

            if (start == s.length()) {
                return true;
            }
        }

        return false;
    }
}