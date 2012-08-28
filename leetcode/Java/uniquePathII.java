import java.util.*;
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(obstacleGrid[0][0] == 1)
            return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(0,list,obstacleGrid,0,0,m,n);
        return list.size();  
    }
    
      void dfs(int depth,ArrayList<Integer> list,int[][] matrix,int i, int j,int m,int n){
        if(depth == m+n-2){
            list.add(1);
            return;
        }

        if(i+1 < m && matrix[i+1][j] != 1){
            dfs(depth+1,list,matrix,i+1,j,m,n);
        }
        if(j+1 < n && matrix[i][j+1] != 1){
            dfs(depth+1,list,matrix,i,j+1,m,n);
        }
        
     }
}