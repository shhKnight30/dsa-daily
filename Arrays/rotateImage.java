class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix[0].length;j++){
                int temp = matrix[matrix[0].length-i-1][j];
                matrix[matrix.length-i-1][j] =matrix[i][j] ;
                matrix[i][j] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i] ;
                matrix[j][i] = temp;
            }
        }
        
    }   

}