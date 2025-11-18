class Solution {
    public int reverse(int x) {
        long  last_digit , rev_num = 0;
        while(x!=0){
            last_digit=x%10;
            x/=10;
            rev_num = (rev_num*10)+last_digit;
            if(rev_num < Integer.MIN_VALUE || rev_num> Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int) rev_num;
    }
}