import java.lang.String;

public class Solution{
    public String longestPalindrome(String s){
        int l = s.length();
        int maxSoFar = 0;
        int curEnd = 0;
        int p = 0;  //start index for masSoFar
        int q = 0;
        int m = 0;  //start index for curEnd
        int n = 0;
        for(int i = 0; i < l;++i){
            if(s.charAt(i) == s.charAt(m-1)){
                m--;
                n++;
            }
            else{
                m = n+1;
                n = n+1;
            }
            curEnd = n-m+1;
            if(curEnd > maxSoFar){
                p = m;
                q = n;
                maxSoFar = q-p+1;
            }
        }

        return s.substring(p,q+1);
    }

    public boolean ifPalindrome(String s){
        int n = s.length();
        for(int i = 0; i < n/2;++i){
            if(s.charAt(i) != s.charAt(n-i-1))
                return false;
        }
        return true;
    }



}
