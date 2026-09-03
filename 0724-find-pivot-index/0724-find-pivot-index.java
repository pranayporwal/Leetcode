class Solution {
    public int pivotIndex(int[] nums) {
        int pivot =-1;
        int[] sum = new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            sum[i+1] += nums[i] + sum[i];
        }
        for(int i =1;i<sum.length;i++){
            if(sum[i-1] == (sum[sum.length-1]-sum[i])){
                pivot = i-1;
                break;
            }
        }return pivot;
    }
}