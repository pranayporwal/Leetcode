class Solution {
    public boolean isPalindrome(int x) {
        int rev_num=0, last_digit;
        int temp = x;
        while(x>0){
            last_digit = x%10;
            rev_num = rev_num*10 + last_digit;
            x/=10;
        }
        if(temp==rev_num){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}