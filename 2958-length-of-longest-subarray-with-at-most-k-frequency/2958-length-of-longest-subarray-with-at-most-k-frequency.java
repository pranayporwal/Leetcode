class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left =0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right =0;right<nums.length;right++){
            int num =nums[right];
            map.put(num,map.getOrDefault(num,0)+1);
            while(map.get(num)>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            count = Math.max(count,right-left+1);
        }
        return count;
    }
}