public class Solution {
    public String convert(String s, int nRows) {
        String p = "";
        int l = 2*nRows-2;
        if(nRows == 1 || nRows >= s.length())
            return s;
            
        for(int i = 0; i < s.length(); i+=l)
            p += s.charAt(i);
        
        int dist = l-2;
        for(int i = 1; i < nRows-1;++i,dist-=2){
            for(int j = i; j < s.length();j+=l){
                p += s.charAt(j);
                if(j+dist < s.length())
                    p += s.charAt(j+dist);
            }
        }
        
        for(int i = nRows-1; i < s.length(); i+=l)
            p += s.charAt(i);
            
        return p;
        
    }
}