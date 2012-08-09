import java.lang.String;

public class Solution{
    public String longestPalindrome(String s){
        int n = s.length();
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < n;++i){
            int j = i+1;
               
            while(j < n){
                if(ifPalindrome(s.substring(i,j+1))){
                    int l = j-i+1;
                    if(j+l < n && ifPalindrome(s.substring(j,j+l+1))){
                        j = j+l;
                        continue;
                           
                    }
                        
                            
                    else if(j+l+1 < n && ifPalindrome(s.substring(j+1,j+l+2))){
                        j = j+l+1;
                        continue;           
                    }
                    
                    if(j-i+1 > max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                    break;
                               
                }
                else
                    ++j;
                
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