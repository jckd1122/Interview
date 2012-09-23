class Solution {
public:
    bool isMatch(const char *s, const char *p) {
        if (*p == '\0') {
            return (*p == *s);
        }
       
        if (p[1] == '*') {
            while(parse_one(s, p)) {
                if(isMatch(s, p+2))
                    return true;
                s++;
            }
            
            return isMatch(s, p+2);
            
        }
        else {
            return (parse_one(s, p)) && isMatch(s+1, p+1);
            
        }
    }

    bool parse_one(const char *s, const char *p) {
        if (*s != '\0' && (*p == '.' || *p == *s)) {
            return true;
        }
        return false;
    }
};
