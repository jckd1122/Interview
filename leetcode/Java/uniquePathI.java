import java.util.*;
public class Solution{
    public int uniquePaths(int m,int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(0,list,0,0,m,n);
        return list.size();    
        

    }

    void dfs(int depth,ArrayList<Integer> list,int i, int j,int m,int n){
        if(depth == m+n-2){
            list.add(1);
            return;
        }

        if(i+1 < m){
            dfs(depth+1,list,i+1,j,m,n);
        }
        if(j+1 < n){
            dfs(depth+1,list,i,j+1,m,n);
        }
        
     }



}