public class Solution{
    public boolean isMatch(String s,String p){
        int l1 = s.length();
        int l2 = p.length();
        int i = 0;
        int j = 0;
        if(l1 == 0)
            return (l2 == 0);
        
        //if(j < l2-1 && p.charAt(j+1) != '*')
        //    return (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') && isMatch(s.substring(i+1),p.substring(j+1));
        //
        //while((i < l1 && s.charAt(i) == p.charAt(j)) || (i < l1 && p.charAt(j) == '.')){
        //    if(isMatch(s.substring(i),p.substring(j+2)))
        //        return true;
        //    i++;
        //}        
        //return isMatch(s.substring(i),p.substring(j+2));

    }

}
