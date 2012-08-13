public class Solution {
      public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int tmp1 = 0;
        int tmp2 = 0;
      
        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                if(matrix[i][j] == 0){
                    matrix[0][j]= Integer.MAX_VALUE;     //for col
                    matrix[i][0] = Integer.MAX_VALUE;    //for row
                    if(i == 0)
                        tmp1 = 1;
                    if(j == 0)
                        tmp2 = 1;
                }
            }
        }
        
        //can't update the matrix's first col and row first, since it contains information about zero row and col
        for(int i = 1; i < m; ++i){
            if(matrix[i][0] == Integer.MAX_VALUE){
                for(int j = 0; j < n;++j){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j = 1; j < n; ++j){
            if(matrix[0][j] == Integer.MAX_VALUE){
                for(int i = 0; i < m;++i){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(tmp1 == 1){
            for(int j = 0; j < n;++j){
                matrix[0][j] = 0;
    
            }
        }
        
        if(tmp2 == 1){
            for(int i = 0; i < m;++i){
                matrix[i][0] = 0;
            }
        }
    }
}