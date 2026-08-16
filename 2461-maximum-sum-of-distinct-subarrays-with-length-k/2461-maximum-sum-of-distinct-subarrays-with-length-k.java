class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mpp = new HashMap<>();
        long sum = 0;
        long maxSum = 0;
        for (int i = 0; i < k; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }
        if (mpp.size() == k) {
            maxSum = sum;
        }
        for (int right = k; right < nums.length; right++) {
            int left = right - k;
            int numDel = nums[left];
            sum -= numDel;
            mpp.put(numDel, mpp.get(numDel) - 1);
            if (mpp.get(numDel) == 0) {
                mpp.remove(numDel);
            }
            int numAdd = nums[right];
            sum += numAdd;
            mpp.put(numAdd, mpp.getOrDefault(numAdd, 0) + 1);
            if (mpp.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}