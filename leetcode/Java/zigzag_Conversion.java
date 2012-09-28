public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String p = "";
        String q = s;
        char[][] table = new char[nRows][s.length()/nRows+1];
        if(nRows == 1 || nRows >= s.length())
            return s;
        if(nRows == 2){
            for(int j = 0; j < s.length()/nRows+1;++j){
                for(int i = 0; i < nRows;++i){
                    table[i][j] = q.charAt(0);
                    q = q.substring(1);
                }
            }
        }
        
        
        for(int i = 0; i < nRows;++i){
            for(int j = 0; j < s.length()/nRows+1;++j){
                if(table[i][j] != ' ')
                    q = q+table[i][j];
            }
        }
        
        return q;
    
    }
}