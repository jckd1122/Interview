import java.lang.String;

public class Solution{
    public String longestPalindrome(String s){
        int n = s.length();
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < n;++i){
            for(int j = i+1; j < n;++j){
                ifPalindrome(s.substring(i,j+1)){
                    if(j-i+1 > max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
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
