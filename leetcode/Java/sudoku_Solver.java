public class Solution{
    public void solveSudoku(char[][] board){
       //create vector 
       //loop from back
        object m = v.pop_back()
        dfs(board,v,0,m.x,m.y);
    }

    boolean dfs(int[][] board,v,int depth,int x, int y){
    
        if(depth  == numer of '.')
            return true;
        if(set.size() == empty)
            return false;

        }

        //check,get the correct set(consider both x,y direction)
        //pick up a value from set
        //if set is empty return false;
        for(int i = 0;i < v.size();++i){
            object m = v.pop_back();
            if(y < m-1) 
                dfs(board,depth+1,x,);
            else
                dfs(board,depth,x+1,0);
        }


    }

    void check(int[][] board,int x,int y){
                

    }

}
