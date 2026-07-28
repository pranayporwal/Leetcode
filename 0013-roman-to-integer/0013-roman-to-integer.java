class Solution {
    public int romanToInt(String s) {
       int sum= 0;
       for(int i =0;i<s.length();i++){
        if(i==s.length()-1){
            sum+=getRoman(s.charAt(i));
        }
        else{
        int cur = getRoman(s.charAt(i));
        int next = getRoman(s.charAt(i+1));
        if( cur >= next ){
            sum+=cur;
        }
        else{
            sum += (next-cur);
            i++;
        }
       }
       }
       return sum; 
    }
    private int getRoman(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        return 0;
    }
}