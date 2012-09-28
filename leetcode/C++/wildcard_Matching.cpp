class Solution{
public:
    bool isMatch(const char *s,const char *p){
        if(*p == '\0')
            return (*p == *s);

        if(p[0] == '*'){
            while(*s != '\0'){
                if(isMatch(s,p+1))
                    return true;
                s++;
            }
            while(*p != '\0'){
                if(*p != '*')
                    return false;
                p++;
            }
            return true;
        }
        else
            return parse_one(s,p) && isMatch(s+1,p+1);

    }
    
    //using DP 
    bool isMatch(const char *s,const char *p){
        int[][] table = new int[strlen(s)+1][strlen(p)+1];
        return isMatch_Helper(s,p,table,0,0);
        

    }
    
    bool isMatch_Helper(const char *s,const char *p, int[][] table,int i, int j){
        if(table[i][j] != -1 )
            return (table[i][j] == 0)? false;true;
        
        if(p[i] == '\0')
            return (p[i] == s[j]);

        if(p[i] == '*'){
            while(s[j] != '\0'){
                if(isMatch_Helper(s,p,table,i,j+1))
                    table[i][j] = 1;
                i++;
            }
            while(p[i] != '\0'){
                if(p[i] != '*')
                    table[i][j] = 0;;
                j++;
            }
            table[i][j] = 1;
        }
        else
            return parse_one(s[i],p[j]) && isMatch_Helper(s,p,table,i+1,j+1);
        
        
    }
    
   bool parse_one(const char s,const char p){
     if(s != '\0' && (p == '?' || p == s))
            return true;
        return false;
   } 

   bool parse_one(const char *s,const char *p){
        if(*s != '\0' && (*p == '?' || *p == *s))
            return true;
        return false;

    }
};