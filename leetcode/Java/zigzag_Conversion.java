public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String p = "";
        String q = s;
        char[][] table = new char[nRows][s.length()/2+2];
        for(int i = 0; i < nRows;++i){
            for(int j = 0; j < s.length()/2+2;++j){
                table[i][j] = ' ';       
            }
        }
        
        if(nRows == 1 || nRows >= s.length())
            return s;
        if(nRows == 2){
            for(int j = 0; j < (s.length()/2)+2;++j){
                for(int i = 0; i < nRows;++i){
                    
                    table[i][j] = q.charAt(0);
                    if(q.length() >= 2)
                        q = q.substring(1);
                    
                }
            }
        }
        
        if(nRows >= 3){
            int j = 0;
            while(j < (s.length()/2)+2){
                if(j %2 == 0){
                    if(j == 0){
                        for(int i = 0; i < nRows;++i){
                            table[i][j] = q.charAt(0);
                            if(q.length() >= 2)
                                q = q.substring(1);
                        }
                    }
                    else{
                        for(int i = nRows-3; i < nRows;++i){
                            table[i][j] = q.charAt(0);
                            if(q.length() >= 2)
                                q = q.substring(1);
                        }
                    }
                }
                else{
                   table[nRows-2][j] = q.charAt(0);
                   if(q.length() >= 2)
                       q = q.substring(1); 
                }
                j++;
            }
        }
        
        for(int i = 0; i < nRows;++i){
            for(int j = 0; j < s.length()/2+2;++j){
                if(table[i][j] != ' ')
                    q = q+table[i][j];
            }
        }
        
        return q;
    
    }
}