class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        solve(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public void solve(int[] candidates, int target, int index,
                      List<Integer> current,
                      List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Take the current element
        current.add(candidates[index]);

        // Same index because we can reuse the element
        solve(candidates, target - candidates[index],
              index, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Do not take the current element
        solve(candidates, target, index + 1,
              current, result);
    }
}