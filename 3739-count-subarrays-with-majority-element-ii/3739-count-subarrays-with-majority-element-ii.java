class BinaryIndexedTree {
    int n;
    int[] bit;

    BinaryIndexedTree(int n) {
        this.n = n;
        bit = new int[n + 1];
    }

    void update(int index, int val) {
        while (index <= n) {
            bit[index] += val;
            index += index & -index;
        }
    }

    int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += bit[index];
            index -= index & -index;
        }
        return sum;
    }
}

class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;

        BinaryIndexedTree bit = new BinaryIndexedTree(2 * n + 1);

        int prefix = n + 1;      // shift to avoid negative indices
        bit.update(prefix, 1);

        long ans = 0;

        for (int x : nums) {

            if (x == target)
                prefix++;
            else
                prefix--;

            ans += bit.query(prefix - 1);

            bit.update(prefix, 1);
        }

        return ans;
    }
}