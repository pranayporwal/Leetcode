class Solution {
    public String reverseWords(String s) {
        int left =0;
        char[] arr = s.toCharArray();
        for(int i =0;i<arr.length;i++){
            if(arr[i] == ' ' ){
                reverse(arr,left,i-1);
                left = i+1;
            }
            else if(i == arr.length-1){
                reverse(arr,left,i);
            }
        }
        return new String(arr);
    }
    public void reverse(char[] arr,int left , int right){
        char temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}