
public class longestPrefix{
    public String longestCommonPrefix(String[] strs){
        int l = 0;
        int u = 0;
        boolean finish = true;
        String first = strs[0];

        if (first.length() == 0)
            return "";
        for(int i = 0; i < first.length();++i){
            for(int j = 1; j < strs.length;++j){
                if(strs[j].length() == 0){
                    finish = false;
                    break;
                }
                if(i < strs[j].length() && first.charAt(i) == strs[j].charAt(i))
                    continue;    
                else{
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