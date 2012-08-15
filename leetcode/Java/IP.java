
public class Solution{
    public ArrayList<String> restoreIpAddresses(String s){
        ArrayList<String> list = new ArrayList<String>();
        restoreHelper(list,s,"");


    }

    void restoreIpHelper(ArrayList<String> list,String restStr,String cur){
        int n = restStr.length();
        if(n == 0)
            list.add(cur);

       for(int i = 0; i < n;++i){
           if((i == 3 && Integer.parseInt(restStr.substring(0,3)) > 255) || (i > 3))
               break;
           string added = restStr.substring(0,i);
           restoreIpHelper(list,restStr.substring(i,n,cur+added);)

       }


    }





}
