class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int minIndex = 0;
        int maxIndex = 0;

        // 1. Correctly find the absolute positions of min and max elements
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) { // Separate IF ensures both track correctly
                maxIndex = i;
            }
        }

        // 2. Identify which index is physically closer to the left boundary
        int low = Math.min(minIndex, maxIndex);
        int high = Math.max(minIndex, maxIndex);

        // 3. Compute costs for the three possible execution strategies
        int removeFromLeftOnly = high + 1;
        int removeFromRightOnly = n - low;
        int removeFromBothSides = (low + 1) + (n - high);

        return Math.min(removeFromLeftOnly, Math.min(removeFromRightOnly, removeFromBothSides));
    }
}
