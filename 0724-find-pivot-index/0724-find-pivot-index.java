class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum =0;
        int leftSum=0;
        int pivot =-1;
        for(int num : nums){
            totalSum += num;
        }
        for(int i =0;i<nums.length;i++){
            if(leftSum == (totalSum-leftSum-nums[i])){
                pivot = i;
                break;
            }
            leftSum += nums[i];
        }return pivot;
    }
}