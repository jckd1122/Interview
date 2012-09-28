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
    
    bool parse_one(const char *s,const char *p){
        if(*s != '\0' && (*p == '?' || *p == *s))
            return true;
        return false;

    }
};


class Solution{
public:
    bool isMatch(const char *s,const char *p){
        int m = strlen(s)+1;
        int n = strlen(p)+1;
        vector<vector<int> > table(m, vector<int>(n, -1));
        return isMatch_Helper(s,p,table,0,0);
        

    }
    
    bool isMatch_Helper(const char *s,const char *p,vector<vector<int> > table,int i, int j){
        if(table[i][j] != -1 )
            return (table[i][j] == 0)? false:true;
        
        if(p[j] == '\0')
            return (p[j] == s[i]);

        if(p[j] == '*'){
            while(s[i] != '\0'){
                if(isMatch_Helper(s,p,table,i,j+1)){
                    table[i][j] = 1;
                    return 1;
                }
                i++;
            }
            while(p[j] != '\0'){
                if(p[j] != '*'){
                    table[i][j] = 0;
                    return 0;
                }
                j++;
            }
            table[i][j] = 1;
        }
        else
            return parse_one(s[i],p[j]) && isMatch_Helper(s,p,table,i+1,j+1);
        
        return table[i][j];
        
    }
    
   bool parse_one(const char s,const char p){
     if(s != '\0' && (p == '?' || p == s))
        return true;
     return false;
   } 
};

//iterative
class Solution{
public:
    bool isMatch(const char *s,const char *p){
        int i = 0;
        int j = 0;

        while(j < strlen(p)){
            while(i < strlen(s)){
                if(p[j] == '*'){
                    for(int k = 0; k <= strlen(s)-i;++k){
                        while(i+k < stelen(s) && s[i+k] == p[j]){
                            i++;
                            j++;
                        }
                        if(i+k == strlen(s))
                            return true;
                    }       
                    
                }
                else{
                    if(!parse_one(s[i],p[j]))
                        return false;
                    i++;
                    j++;
                }
            }    
            return j >= strlen(p);
        }
        return i >= strlen(s);       
        
       

    }
    
    bool parse_one(const char s,const char p){
     if(s != '\0' && (p == '?' || p == s))
        return true;
     return false;
   } 
};
