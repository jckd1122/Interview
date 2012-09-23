import java.util.*;

public class Solution{
    public ArrayList<Integer> spiralOrder(int[][] matrix){
        int m = matrix.length;
        int n = (m != 0)? n = matrix[0].length:0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        spiral_Helper(list,matrix,0,0,m,n);
        return list;
    }
    
    void spiral_Helper(ArrayList<Integer> list,int[][] matrix,int x, int y,int m, int n){
        if(m == 0 || n == 0)
            return;
        if(m == 1){
            for(int i = y; i < y+n;++i)
                list.add(matrix[x][i]);
            return;
        }
        if(n == 1){
            for(int i = x; i < x+m;++i)
                list.add(matrix[i][y]);
            return;
        }
        
        for(int j = x; j < n+x-1;++j)
            list.add(matrix[x][j]);
        for(int k = x; k < m+x-1;++k)
            list.add(matrix[k][n+x-1]);
        for(int p = n+y-1;p > y;--p)
            list.add(matrix[x+m-1][p]);
        for(int q = m+x-1; q > x;--q)
            list.add(matrix[q][y]);
        x++;
        y++;
        spiral_Helper(list,matrix,x,y,m-2,n-2);
    }


}