import java.util.*;

public class Solution{
    public ArrayList<Integer> spiralOrder(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < m/2;++i){
            for(int j = i; j < n-i-1;++j)
                list.add(matrix[i][j]);
            for(int k = i; k < m-i-1;++k)
                list.add(matrix[k][n-i-1]);
            for(int p = n-i-1; p > i;++p)
                list.add(matrix[m-i-1][p];
            for(int q = m-i-1; q > i;++q)
                list.add(matrix[q][i];

            
        }
        return list;

    }

    


}