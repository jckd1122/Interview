public class Solution {
      public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
      
        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                if(matrix[i][j] == 0){
                      matrix[0][j]= 1;     //for col
                      matrix[i][0] = 1;    //for row
                }
            }
        }
        
        for(int i = 0; i < m; ++i){
            if(matrix[i][0]){
                for(int j = 0; j < n;++j){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j = 0; j < n; ++j){
            if(matrix[0][j]){
                for(int i = 0; i < m;++i){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}