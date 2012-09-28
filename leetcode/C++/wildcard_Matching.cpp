class Solution{
    bool isMatch(const char *s,const char *p){
        if(*p == '\0')
            return (*p == *s);

        if(p[0] == '*'){
            while(*s != '\0'){
                if(isMatch(s,p+1))
                    return true;
                s++;
            }
            return false;
        }
        else
            return parse_one(s,p) && isMatch(s+1,p+1);

    }

   bool parse_one(const char *s,const char *p){
        if(*s != '\0' && (*p == '?' || *p == *s))
            return true;
        return false;

    }
}