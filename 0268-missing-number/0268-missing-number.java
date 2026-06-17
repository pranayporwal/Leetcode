class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sol = 0;
        int[] hash = new int[n+1];
        for(int num : nums){
            hash[num] = 1;
        }
        for(int i = 0;i<(n+1);i++){
            if(hash[i]==0){
                sol = i;
            }
        }
        return sol;
    }
}