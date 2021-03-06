import java.util.Vector;

public class Solution{
    public void solveSudoku(char[][] board){
       //create vector 
       //loop from back
       Vector<Integer> v1 = new Vector<Integer>();
       Vector<Integer> v2 = new Vector<Integer>();
       for(int i = 0; i <= 8;++i){
           for(int j = 0; j <= 8;++j){
                if(board[i][j] == '.'){
                    v1.add(i);
                    v2.add(j);
                }
           }
       }
    
       

        dfs(board,0,v1,v2);
        return;
    }
    
    boolean dfs(char[][] board,int depth,Vector<Integer> v1,Vector<Integer> v2){
    
        if(depth  == v1.size())
            return true;
        

        //check,get the correct set(consider both x,y direction)
        //pick up a value from set
        //if set is empty return false;
        int x = v1.get(depth);
        int y = v2.get(depth);
        for(int i = 1;i <= 9;++i){
            if(check(board,x,y,i) == true){
                board[x][y] = (char)(i+48);
                if(dfs(board,depth+1,v1,v2) == true)
                    return true;
                board[x][y] = '.';
            }
        }
        return false;


    }

    boolean check(char[][] board,int x,int y,int num){
        for(int j = 0; j <= 8;++j){
            if(board[x][j] == (char)(num+48))
                return false;
        }
        for(int i = 0; i <= 8;++i){
            if(board[i][y] == (char)(num+48))
                return false;
        }
        return true;
    }

}