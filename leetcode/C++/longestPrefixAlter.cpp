

class Solution{
public:
    string longestCommonPrefix(vector<string> &strs){
        int n = strs.size();
        if(n == 0)
            return "";

        string cmp = strs[0]; 
        for(int i = 0; i < n;++i){
            if(cmp.size() > strs[i])
                cmp = strs[i];
            for(int j = 0; j < cmp.size();++j){
                if(cmp[j] != strs[i][j])
                    cmp = cmp.substr(0,j);

            }

        }
        return cmp;


    }



}
