public class Solution {
      public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                if(matrix[i][j] != 0){
                    for(int k = j+1; k < n;++k){
                        if(matrix[i][k] == 0)
                            matrix[i][j] = 0;
                    }
                    for(int k = i+1; k < m;++k){
                        if(matrix[k][j] == 0)
                            matrix[i][j] = 0;
                    }

                }

            }

        }


    }
}