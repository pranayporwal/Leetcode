class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] freqP = new int[26];
        int[] freqS = new int[26];
        int n = p.length();
        if(s.length()<n){
            return ans;
        }
        for(int i = 0;i<p.length();i++){
            freqP[p.charAt(i) - 'a']++;
            freqS[s.charAt(i) - 'a']++;
        }
        
        
        if(checkAnagram(freqP,freqS)) ans.add(0);
        for(int i =n;i<s.length();i++){
            freqS[s.charAt(i) - 'a']++;
            freqS[s.charAt(i-n) - 'a']--;            
            if(checkAnagram(freqP,freqS)){
                ans.add(i-n+1);
            }
        }
        return ans;
        }
    
    private boolean checkAnagram(int[]freq1 , int[] freq2){
        for(int  i =0;i<26;i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}