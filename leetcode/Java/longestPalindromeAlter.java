public class Solution {
    public static String longestPalindrome(String s){
        int n = s.length();
        int l,u;
        int p = 0;
        int q = 0;

        for(int i = 0; i < n-1;++i){
            //if s[i] ,s[i]is in the middle
            if(s.charAt(i) == s.charAt(i+1)){
                l = i;
                u = i+1;
                while(l > 0 && u < n-1){
                    l--;
                    u++;
                    if(s.charAt(l) != s.charAt(u)){
                        l++;
                        u--;
                        break;
                    }
                }
                if(q-p < u-l){
                    q = u;
                    p = l;
                }
            }
            //s[i] in the middle
            l = i;
            u = i;
            while(l > 0 && u < n-1){
                l--;
                u++;
                if(s.charAt(l) != s.charAt(u)){
                    l++;
                    u--;
                    break;
                }
            }
            if(q-p < u-l){
                q = u;
                p = l;
            }
        }
        return s.substring(p,q+1);
    }
}