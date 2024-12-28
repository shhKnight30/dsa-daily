
import java.util.HashSet;

class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rset = new HashSet();
        HashSet<Integer> cset = new HashSet();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rset.add(i);
                    cset.add(j);
                }
            }
     }
      for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rset.contains(i)||cset.contains(j)){
                    matrix[i][j] = 0;
                }
            }
     }
        
    }
}