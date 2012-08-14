public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = s1.length();
        if(n == 1)
            return s1.charAt(0) == s2.charAt(0);
        for(int i = 0; i < n;++i){
            if(s1.charAt(0) == s2.charAt(i)){
                return isScramble(s1.substring(1,n),s2.substring(i+1,n)+s2.substring(0,i));
            }
        }
        return false;
    }
}