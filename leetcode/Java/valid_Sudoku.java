import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] table = new boolean[10];
        int m = board.length;
        int n = board[0].length;
        if(m != 9 || n != 9) return false;
        
        for(int i = 0; i < m;++i){
            Arrays.fill(table,false);
            for(int j = 0; j < n;++j){
                if(board[i][j] != '.'){
                    if(table[board[i][j] -'0'])
                        return false;
                    else
                        table[board[i][j]-'0'] = true;
                }
            }
       }
       
        for(int i = 0; i < n;++i){
            Arrays.fill(table,false);
            for(int j = 0; j < m;++j){
                if(board[j][i] != '.'){
                    if(table[board[j][i] -'0'])
                        return false;
                    else
                        table[board[j][i]-'0'] = true;
                }
            }
       }
       
       for(int i = 0; i < 3;++i){
           for(int j = 0; j < 3;++j){
                Arrays.fill(table,false);
                for(int x = 0; x < 3;++x){
                    for(int y = 0; y < 3;++y){
                        if(board[3*i+x][3*j+y] != '.'){
                            if(table[board[i][j] -'0'])
                                return false;
                            else
                                table[board[3*i+x][3*j+y]-'0'] = true;
                        }
                    }
                    
               }
                
                
           }
           
      }
      
      return true;
       
       
       
       
        
        
    }
}

