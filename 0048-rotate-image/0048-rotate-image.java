class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col = matrix[0].length;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(i<j){
                    swap(matrix,i,j);
                }
            }
        }
        for(int i =0;i<row;i++){
            reverse(matrix,i,col);
        }
    }
    public void swap(int[][] matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j]= matrix[j][i];
        matrix[j][i]=temp;
    }
    public void reverse(int [][]matrix,int i,int col){
        int start =0;
        int end =col-1;
        while(start<end){
            int temp=matrix[i][start];
            matrix[i][start++]=matrix[i][end];
            matrix[i][end--]=temp;
        }
    }
        

    

}