class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max_count =0;
        for(int num:nums){
            if(num == 1){
                count++;
                max_count = Math.max(count,max_count);
            }
            else{
                count=0;
                }
            
        }
        return max_count;
    }
}