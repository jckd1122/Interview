public class Soilution{
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for(int i = 0; i < m;++i){
            if(obstacleGrid[i][0] != 1)
                obstacleGrid[i][0] = 1;
            else{
                for(int k = i ; k < m;++k)
                    obstacleGrid[k][0] = 0;
            }
        }
        for(int j = 0; j < n;++j){
            if(obstacleGrid[0][j] != 1)
                obstacleGrid[0][j] = 1;
            else{
                for(int k = j ; k < n;++k)
                    obstacleGrid[0][k] = 0;
            }
        }

        for(int i = 1; i < m;++i){
            for(int j = 1; j < n;++j){
                obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1];

            }

        }
        return obstacleGrid[m-1][n-1];

    }





}
