import java.util.*;
public class Solution {
    public static ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<String> list = new ArrayList<String>();
        int l = s.length()+4;
        restoreHelper(list,s,"",l);
        return list;


    }

    static void restoreHelper(ArrayList<String> list,String restStr,String cur,int l){
        int n = restStr.length();
        if(restStr == ""){
            if(cur.length() == l){ 
                list.add(cur.substring(0,cur.length()-1));
                
            }
            return;
            
        }

       for(int i = 1; i <= n;++i){
           if((i == 3 && Integer.parseInt(restStr.substring(0,3)) > 255) || (i > 3))
               break;
           String added = restStr.substring(0,i)+".";
           
           
           restoreHelper(list,restStr.substring(i,n),cur+added,l);

       }


    }

       


    
    
}
    
    
    
    
    
    
 