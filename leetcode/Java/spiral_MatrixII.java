public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 0;
        for(int i = 0; i <= n/2;++i){
            if(n-2*i == 1){
                matrix[i][i] = ++num;
                return matrix;
            }
            
            for(int j = i; j < n-i-1;++j){
                matrix[i][j] = ++num;
            }
            for(int k = i; k < n-i-1;++k){
                matrix[k][n-i-1] = ++num;
            }
            for(int p = n-i-1; p > i;--p){
                matrix[n-i-1][p] = ++num;
            }
            for(int q = n-i-1; q > i;--q){
                matrix[q][i] = ++num;
            }
                
        }
        return matrix;
        
    }
}
