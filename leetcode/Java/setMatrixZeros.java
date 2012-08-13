public class Solution {
      public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] arr1 = new boolean[m];
        boolean[] arr2 = new boolean[n];
 
        for(int i = m-1; i >= 0;--i){
            for(int j = n-1; j >= 0;--j){
                if(matrix[i][j] == 0){
                      arr1[i] = true;
                      arr2[j] = true;
                }

        }
        
        for(int i = 0; i < m; ++i){
            if(arr1[i]){
                for(int j = 0; j < n;++j){
                    matrix[i][j] == 0;
                }
            }
              
        }
        
         for(int j = 0; j < n; ++j){
            if(arr2[j]){
                for(int i = 0; i < m;++i){
                    matrix[i][j] == 0;
                }
            }
              
        }
        


    }
}