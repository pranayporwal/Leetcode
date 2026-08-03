class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0d;
        double max_sum = Integer.MIN_VALUE;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        max_sum =sum;
        for(int i =k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            max_sum = Math.max(sum,max_sum);
        }
        return max_sum/k;

    }
}