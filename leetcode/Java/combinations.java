import java.util.*;
public class Solution{
    public ArrayList<ArrayList<Integer>> combine(int n ,int k){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        dfs(list,buffer,0,n,k);
        return list;
    }

    void dfs(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> buffer, int depth, int n, int k){
        if(buffer.size() == k){
            list.add(buffer);
            return;
        }

        for(int i = 1; i <= n;++i){
            buffer.add(i);
            dfs(list,buffer,depth+1,n,k);
            buffer.remove(buffer.size()-1);
        }
    }
}