class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        solve(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void solve(int[] nums, int start,
                      List<Integer> temp,
                      List<List<Integer>> ans) {

        // Every state is a valid subset
        ans.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate choices at the same level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose
            temp.add(nums[i]);

            // Move forward because each array position is used at most once
            solve(nums, i + 1, temp, ans);

            // Backtrack
            temp.remove(temp.size() - 1);
        }
    }
}