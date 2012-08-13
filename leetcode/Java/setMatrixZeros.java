public class Solution {
      public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = m-1; i >= 0;--i){
            for(int j = n-1; j >= 0;--j){
                if(matrix[i][j] != 0){
                    for(int k = 0; k < n;++k){
                        if(matrix[i][k] == 0)
                            matrix[i][j] = 0;
                    }
                    for(int k = 0; k < m;++k){
                        if(matrix[k][j] == 0)
                            matrix[i][j] = 0;
                    }

                }

            }

        }


    }
}