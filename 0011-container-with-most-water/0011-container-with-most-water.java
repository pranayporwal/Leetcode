class Solution {
    public int maxArea(int[] height) {
        int j = height.length-1;
        int i=0;
        int max=0;
        int vol=0;
        while(i<j){
            if(height[i]<=height[j]){
                vol=height[i]*(j-i);
                i++;
            }
            else{
                vol=height[j]*(j-i);
                j--;
            }
            max= Math.max(vol,max);
        }
        return max;
    }
}