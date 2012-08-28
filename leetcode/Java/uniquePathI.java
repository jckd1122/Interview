public class Solution{
    public int uniquePaths(int m,int n){
        int count = 0;
        dfs(0,count,i,j,m,n);

    }

    void dfs(int depth,int count,int i, int j,int m, int n){
        if(depth == m+n-2){
            count++;
            return;
        }

        if(i+1 < m){
            dfs(depth+1,count,i+1,j,m,n);
        }
        if(j+1 < n){
            dfs(depth+1,count,j+1,m,n);
        }
            


    }



}
