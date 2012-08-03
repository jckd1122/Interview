import java.lang.*;
public class Solution {
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
       
            
        int m = word1.length();
        int n = word2.length();
        
        int[][] dist = new int[m+1][n+1];
        for(int i = 0; i < m+1;++i)
            dist[i][0] = i;
        for(int j = 0; j < n+1;++j)
            dist[0][j] = j;
        
        int repl = 0;
        for(int i = 1; i < m+1;++i){
            for(int j = 1; j < n+1;++j){
                if (word1.charAt(i) == word2.charAt(j))
                    repl = 0;
                else
                    repl = 1;
                dist[i][j] = min(dist[i-1][j]+1,dist[i][j-1]+1,dist[i][j]+repl);

            }

        }
        return dist[m][n];


    }

    public int min(int a,int b ,int c){
        if(a >= b){
            if(b >= c)
                return c;
            else
                return b;
        }
        else if(a >= c)
            return c;
        else
            return a;
    }


        

        
}