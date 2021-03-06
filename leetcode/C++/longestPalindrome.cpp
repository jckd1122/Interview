
class Solution{
public:
    string longestPalindrome(string s){
        int n = s.length();
        int start = 0;
        int end = 0;
        int p = 0;
        int q = 0;

        for(int i = 0; i < n;++i){
            end = n-1;
            start = i;
            
            while(true){
                if(ifPalindrome(s.substr(i,end-i+1)))
                    break;
                else
                    end--;
            }
            if(end-start >= q-p){
                p = start;
                q = end;
            }
        }
        return s.substr(p,q-p+1);
    }

    bool ifPalindrome(string s){
        int n = s.length();
        for(int i = 0; i < n/2;++i){
            if(s[i] != s[n-i-1])
                return false;
        }
        return true;
    }
};