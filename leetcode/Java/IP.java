import java.util.*;
public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<String> list = new ArrayList<String>();
        restoreHelper(list,s,"");
        return list;


    }

    void restoreHelper(ArrayList<String> list,String restStr,String cur){
        int n = restStr.length();
        if(n == 0)
            list.add(cur);

       for(int i = 0; i < n;++i){
           if((i == 3 && Integer.parseInt(restStr.substring(0,3)) > 255) || (i > 3))
               break;
           String added = restStr.substring(0,i);
           if(current.length() 
           restoreHelper(list,restStr.substring(i,n),cur+added);

       }


    }

}