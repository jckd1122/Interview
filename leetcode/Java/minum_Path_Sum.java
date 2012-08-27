import java.lang.Math;

public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = grid.length;
        int n = grid[0].length;
        int[][] table = new int[m][n];
        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                table[i][j] = -1;
            }
        }
        
        table[0][0] = grid[0][0];
        for(int i = 1; i < m; ++i)
            table[i][0] = table[i-1][0]+grid[i][0];
        for(int j = 1; j < n; ++j)
            table[0][j] = table[0][j-1]+grid[0][j];
            
        
        return helper(grid,table,m-1,n-1);
    }
    
    public int helper(int[][] grid,int[][] table,int i, int j){
        int m = grid.length;
        int n = grid[0].length;
        
        
        if(table[i][j] != -1)
            return table[i][j];
            
        
        table[i][j] = Math.min(grid[i][j]+helper(grid,table,i-1,j),grid[i][j]+helper(grid,table,i,j-1));
        
        return table[i][j];
    }
}