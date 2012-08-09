import java.lang.String;

public class Solution{
    public String longestPalindrome(String s){
        int l = s.length();
        int maxSoFarOdd = 0;
        int maxSoFarEven = 0
        int curEnd = 0;
        int p = 0;  //start index for masSoFar
        int q = 0;
        int m = 1;  //start index for curEnd
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
            if(curEnd > maxSoFarOdd){
                p = m;
                q = n;
                maxSoFarOdd = q-p+1;
            }
        }

        p1 = 0;
        q1 = 0;
        m1 = 0;
        n1 = 0;
        curEnd = 0;

        
        for(int i = 0; i < l;++i){
            if(s.charAt(i) == s.charAt(m1)){
                m1--;
                n1++;
            }
            else{
                m1 = n1+1;
                n1 = n1+1;
            }
            curEnd = n1-m1+1;
            if(curEnd > maxSoFarEven){
                p1 = m1;
                q1 = n1;
                maxSoFarEven = q1-p1+1;
            }

        }
        if(maxSoFarEven > maxSoFarOdd)
            return s.substring(p1,q1+1);
        else
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
