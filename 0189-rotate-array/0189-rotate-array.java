class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int n = nums.length;

        int[] temp = new int[n - k];

        for(int i = 0; i < n - k; i++){
            temp[i] = nums[i];
        }

        for(int i = n - k; i < n; i++){
            nums[i - (n - k)] = nums[i];
        }

        for(int i = 0; i < n - k; i++){
            nums[k + i] = temp[i];
        }
    }
}