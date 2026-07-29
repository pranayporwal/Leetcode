class Solution {
    public char findTheDifference(String s, String t) {
       int freq[] = new int[26];
       for(int i =0;i<s.length();i++){
        freq[t.charAt(i)-'a']++;
        freq[s.charAt(i)-'a']--;
       }
       freq[t.charAt(t.length()-1)-'a']++;
       for(int i =0;i<freq.length;i++){
            if(freq[i]==1){
                return (char)(i + 'a');
            }
       }
       return ' ';
    }
}