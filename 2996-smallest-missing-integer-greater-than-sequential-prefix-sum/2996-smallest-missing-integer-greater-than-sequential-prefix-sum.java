class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        // Find the sum of the longest sequential prefix
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        // Find the smallest integer >= sum that is not in nums
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}