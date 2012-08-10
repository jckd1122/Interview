public class Solution {
    public static String longestCommonPrefix(String[] strs){
        int u = -1;
        boolean finish = false;
        
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
                if(i >= strs[j].length() || first.charAt(i) != strs[j].charAt(i)){
                    finish = false;
                    break;
                }
                else{
                    if(j == strs.length-1)
                        finish = true;
                }
            }
            if(finish)
                u++;
            else{
                break;
            }
        }
        return strs[0].substring(0,u+1);
    }
}