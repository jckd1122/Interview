
public class Solution{
    public void rotate(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m;++i){
            for(int k = n-1; k > 0;--k){
                matrix[k][n-i-1] = matrix[i][k];     //copy value to its future location

            }
            for(int j = 0; j < n;++j){
                matrix[i][j] = matrix[n-j-1][i];
            }
            n--;

        }



    }




}
