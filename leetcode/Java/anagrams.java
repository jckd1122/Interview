import java.util.*;

public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
       Hashtable<Integer,ArrayList<String>> table = new Hashtable<Integer,ArrayList<String>>();
       ArrayList<String> list = new ArrayList<String>();
       for(int i = 0; i < strs.length;++i){
           //char[] arr = strs[i].toCharArray();
           //Arrays.sort(arr);
           int val = RSHash(strs[i]);
           
           //ArrayList<String> subList = new ArrayList<String>();
           //subList.add(strs[i]);
           table.get(val).add(strs[i]);
           
       }
       
       Set<Integer> set = table.keySet();
       Iterator<Integer> itr = set.iterator();
       while (itr.hasNext()){
          int num = itr.next();
          if(table.get(num).size() > 1){
              for(int i = 0 ; i < table.get(num).size();++i)
                  list.add(table.get(num).get(i)); 
          }
       }
    

       return list; 
   }
   
    int RSHash(String str)
    {
        int a = 378551;  
        int b = 63689;  
        int hash = 0;  
        for(int i = 0; i < str.size(); i++)  
        {  
            hash = hash * a + str[i];  
            a = a * b;  
        }  
        return hash;  
    }
   
   int get_Hash(char[] arr){
       int val = 0;
       for(int i = 0; i < arr.length;++i){
           val += arr[i];
       }
       return val;
   }
}