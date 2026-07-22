class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i =0;i<row.length;i++){
            if(row[i] == 1){
                markRows(matrix,i);
            }
        }
        for(int i =0;i<col.length;i++){
            if(col[i] == 1){
                markCol(matrix,i);
            }
        }
    }
    public void markRows(int[][] matrix,int row){
        for(int col=0;col<matrix[0].length;col++){
            if(matrix[row][col] != 0){
                matrix[row][col]=0;
            }
        }
    }
    public void markCol(int[][] matrix,int col){
        for(int row=0;row<matrix.length;row++){
            if(matrix[row][col] != 0){
                matrix[row][col]=0;
            }
        }
    }
}