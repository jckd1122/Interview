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
        
        return helper(grid,table,0,0);
    }
    
    public int helper(int[][] grid,int[][] table,int i, int j){
        int m = grid.length;
        int n = grid[0].length;
        
        if(table[i][j] != -1)
            return table[i][j];
            
        if (i < m-1 && j < n-1)
            table[i][j] = Math.min(grid[i][j]+helper(grid,table,i+1,j),grid[i][j]+helper(grid,table,i,j+1));
        else if (i == m-1 && j < n-1){
            table[i][j] = grid[i][j]+helper(grid,table,i,j+1);
        }
        else if(j == n-1 && i < m-1)
            table[i][j] = grid[i][j]+helper(grid,table,i+1,j);
        else
            table[i][j] = grid[i][j];
        return table[i][j];
    }
}