class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min = nums[nums.length-1];
        int[] minNums = new int[nums.length];
        for(int i= nums.length-1;i>=0;i--){
            if(min>=nums[i]) min = nums[i];
            minNums[i] = min;
        }
        int max = nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i] > max) max =nums[i];
            if((max-minNums[i])<=k) return i;
        }return -1;
    }
}