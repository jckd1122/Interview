class Solution {
public:
    bool isValid(string s) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        vector<int> v;
        
        
        for(int i = 0; i < s.length();++i){
            if(s[i] == '(')
                v.push_back(s[i]);
            if(s[i] == '[')
                v.push_back(s[i]);
            if(s[i] == '{')
                v.push_back(s[i]);
            if(s[i] == ')'){
                if(v.size() == 0 || v[v.size()-1] != '(')
                    return false;
                v.pop_back();
            }
            if(s[i] == ']'){
                if(v.size() == 0 || v[v.size()-1] != '[')
                    return false;
                v.pop_back();
            }
            if(s[i] == '}'){
                if(v.size() == 0 || v[v.size()-1] != '{')
                    return false;
                v.pop_back();
            }
        }
        return (v.size() == 0);
    }
};
