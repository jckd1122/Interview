import java.lang.String;

public class Solution{
    public String longestPalindrome(String s){
        int n = s.length();
        int max = 0;
        int start = 0;
        int end = 0;
        int p = 0;
        int q = 0;
        int l = 0;
        for(int i = 0; i < n;++i){
            start = i;
            end = n-1;
            while(true){
                if(start > end){
                    end = start+end-i;
                    start = i;
                    break;
                }
                
                if(s.charAt(start) == s.charAt(end)){
                    //l = start-end+1;
                    
                    start++;
                    end--;
                    continue;
                }
                else{
                    end--;
                    //q = end;
                    
                }

            }
            if(end-start+1 > q-p+1){
                p = start;
                q = end;
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
