import java.lang.String;
public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = s1.length();
        if(n == 1)
            return s1.charAt(0) == s2.charAt(0);
        for(int i = 0; i < n;++i){
            if(isScramble(s1.substring(0,i+1),s2.substring(0,i+1)) && isScramble(s1.substring(i+1,n),s2.substring(i+1,n)))
                return true;
            if(isScramble(s1.substring(0,i+1),s2.substring(n-i-1,n)) $$ isScramble(s1.substring(i+1,n),s2.substring(0,n-i-1)))
                return true;
        
        }
        return false;
    }
}