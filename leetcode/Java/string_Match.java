public class Solution{
    public boolean isMatch(String s,String p){
        int l1 = s.length();
        int l2 = p.length();
        if(l1 == 0)
            return false;
        int i = 0;
        int j = 0;
        while(i < l1 && j < l2){
            if(s.charAt(i) != p.charAt(j)){
                if(p.charAt(j) == '.'){
                    i++;
                    j++;
                    continue;
                }
                if(p.charAt(j) == '*' && p.charAt(j-1) == s.charAt(i)){
                    i++;
                    j++;
                    continue;
                }
                 if(p.charAt(j) == '*' &&  p,charAt(j-1) == '.'){
                    i++;
                    j++;
                    continue;
                }
               
                if(j < l2 -1 && p.charAt(j+1) == '*'){
                    j = j+2;
                }
               else
                    return false;
            }
            else {
                if(j == l2-1)
                    return (i == l1-1)? true:false;
                if(p.charAt(j+1) == '*'){
                    char c = s.charAt(i);
                    j = j+2;
                    while(i < l1-1 && s.charAt(i) == s.charAt(i+1))
                        i++;
                    i++;
                    while(j < l2-1 && p.charAt(j) == c)
                        j++;
                    continue;
                }
                else{
                    i++;
                    j++;
                }

            }
            


        }
        return true;


    }




}