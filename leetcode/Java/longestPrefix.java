public class Solution {
    public String longestCommonPrefix(String[] strs){
        int l = 0;
        int u = 0;
        boolean finish = true;
        
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        for(int i = 0; i < strs.length;++i){
            if(strs[i].length() == 0)
                return "";
        }
        String first = strs[0];
       
        for(int i = 0; i < first.length();++i){
            for(int j = 1; j < strs.length;++j){
                if(i < strs[j].length() && first.charAt(i) == strs[j].charAt(i))
                    continue;    
                else if(i >= strs[j].length())
                    break;
                else {
                    finish = false;
                    break;
                }
            }
            if(finish)
                u++;
            else
                break;
        }
        return strs[0].substring(l,u+1);
    }

}