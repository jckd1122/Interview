import java.util.*;
public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<String> list = new ArrayList<String>();
        int l = s.length()+4;
        //reduce unnecessary calucalation,works for judge large since it produces a lot of long strings
        if(s.length() > 12)
            return list;
        restoreHelper(list,s,"",l);
        return list;


    }

    void restoreHelper(ArrayList<String> list,String restStr,String cur,int l){
        int n = restStr.length();
        if(restStr.length() == 0){
            if(cur.length() == l){ 
                list.add(cur.substring(0,cur.length()-1));
                
            }
            return;
        }

       for(int i = 1; i <= n;++i){
           if((i == 3 && Integer.parseInt(restStr.substring(0,3)) > 255) || (i > 3))
               break;
           if(i > 1 && restStr.substring(0,i).charAt(0) == '0')
               break;
           String added = restStr.substring(0,i)+".";
           
           restoreHelper(list,restStr.substring(i,n),cur+added,l);
        }
    }

}