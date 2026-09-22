class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        int secondPrev = 0;
        int prev = 1;
        for(int i = 2;i<=n;i++){
            int curr = secondPrev + prev;
            secondPrev = prev;
            prev = curr;
        }
        if(n<=1) return n;
        return prev;
    }
}