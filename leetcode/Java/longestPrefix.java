public class longestPrefix {
    public static String longestCommonPrefix(String[] strs){
        int l = 0;
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
                if(i >= strs[j].length()){
                    finish = false;
                    break;
                }
                else if(first.charAt(i) == strs[j].charAt(i)){
                    if(j == strs.length-1)
                        finish = true;
                    continue;
                }
                else {
                    finish = false;
                    break;
                }
            }
            if(finish)
                u++;
            else{
                break;
            }
        }
        return strs[0].substring(l,u+1);
    }

    public static void main(String[] args){
        String[] strs = {"a","a"};
        System.out.println(longestCommonPrefix(strs));

    }

}
