class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start =0;
        int end = s.length()-1;
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        while(start<end){
            while(start<end && !set.contains(Character.toLowerCase(ch[start]))){
                start++;
            }
            while(start<end && !set.contains(Character.toLowerCase(ch[end]))){
                end--;
            }
            swap(ch,start,end);
            start++;
            end--;
        }
        return new String(ch);
    }
    public void swap(char[] ch , int start , int end){
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end]=temp;
        
    }
}