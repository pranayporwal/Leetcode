class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max_count =0;
        for(int num:nums){
            if(num == 1){
                count++;
                if(count>max_count){
                    max_count = count;
                }
            }
            else{
                if(max_count>count){
                    count=0;
                }
                else{
                    max_count=count;
                    count=0;
                }
            }
        }
        return max_count;
    }
}