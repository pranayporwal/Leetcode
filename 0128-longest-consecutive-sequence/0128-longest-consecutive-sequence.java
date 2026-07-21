class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums){
            hash.add(num);
        }
        if(hash.isEmpty()) return 0;
        int l_streak=0,c_streak=0;
        for(int num : hash){
            if(!hash.contains(num-1)){
                int nnum = num;
                c_streak = 1;
                while(hash.contains(nnum+1)){
                    nnum++;
                    c_streak++;
                }
                l_streak = Math.max(l_streak,c_streak);

            }

        } return l_streak;
    }
}