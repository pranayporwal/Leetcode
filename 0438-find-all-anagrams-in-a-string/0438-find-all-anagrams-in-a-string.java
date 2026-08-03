class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = p.length();
        if(s.length()<p.length()){
            return ans;
        }
        for(int i =0;i<s.length()-n+1;i++){
            if(isAnagram(s.substring(i,i+n),p)){
                ans.add(i);
            }
        }
        return ans;
        }
    
    private boolean isAnagram(String s , String p){
        int[] freq = new int[26];
        for(int i = 0;i<p.length();i++){
            freq[p.charAt(i) - 'a']++;
            freq[s.charAt(i) - 'a']--;
        }
        for(int num : freq){
            if(num !=0){
                return false;
            }
        }
        return true;
    }
}