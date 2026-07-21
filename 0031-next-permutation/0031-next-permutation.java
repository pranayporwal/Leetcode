class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;

        // Step 1: Find the breakpoint
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse the whole array
        if (ind == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find the next greater element from the right
        for (int i = nums.length - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(nums, ind + 1, nums.length - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}