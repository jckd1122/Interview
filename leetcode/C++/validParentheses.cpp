class Solution {
public:
    bool isValid(string s) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        vector<int> a;
        vector<int> b;
        vector<int> c;
        
        for(int i = 0; i < s.length();++i){
            if(s[i] == '(')
                a.push_back(i);
            if(s[i] == '[')
                b.push_back(i);
            if(s[i] == '{')
                c.push_back(i);
            if(s[i] == ')'){
                if(a.size() == 0)
                    return false;
                if(b.size() != 0 && b[b.size()-1] > a[a.size()-1] && i > b[b.size()-1])
                    return false;
                if(c.size() != 0 && c[c.size()-1] > a[a.size()-1] && i > c[c.size()-1])
                    return false;
                a.pop_back();
            }
            if(s[i] == ']'){
                if(b.size() == 0)
                    return false;
                if(a.size() != 0 && a[a.size()-1] > b[b.size()-1] && i > a[a.size()-1])
                    return false;
                if(c.size() != 0 && c[c.size()-1] > b[b.size()-1] && i > c[c.size()-1])
                    return false;
                b.pop_back();
            }
            if(s[i] == '}'){
                if(c.size() == 0)
                    return false;
                 if(a.size() != 0 && a[a.size()-1] > c[c.size()-1] && i > a[a.size()-1])
                    return false;
                if(b.size() != 0 && b[b.size()-1] > c[c.size()-1] && i > b[b.size()-1])
                    return false;
                c.pop_back();
            }
        }
        return (a.size() == 0 && b.size() == 0 )&& (c.size() == 0);
    }
};