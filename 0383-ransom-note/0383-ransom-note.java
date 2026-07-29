class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        for(int i =0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
            if(i<ransomNote.length()){
                freq[ransomNote.charAt(i)-'a']--;
            }
        }
        for(int count : freq){
            if(count<0){
                return false;
            }
        }
        return true;
    }
}