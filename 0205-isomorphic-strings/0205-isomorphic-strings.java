class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mpp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(!mpp.containsKey(s.charAt(i)) && !mpp.containsValue(t.charAt(i))){
                mpp.put(s.charAt(i),t.charAt(i));
            }
            else if(!mpp.containsKey(s.charAt(i)) && mpp.containsValue(t.charAt(i))){
                return false;
            }
            else{
                char ch = mpp.get(s.charAt(i));
                if(ch != t.charAt(i)){
                    return false;
                }
            }
        } return true;
    }
}