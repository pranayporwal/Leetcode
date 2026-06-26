class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int vis[] = new int[1001];
        for(int num : nums1){
            vis[num] += 1;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num: nums2){
            if(vis[num]>0){
                ans.add(num);
                vis[num] -= 1;
            }
        }
        int res[] = new int[ans.size()];
        for(int i =0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}