import java.util.*;

public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
       Hashtable<String,ArrayList<String>> table = new Hashtable<String,ArrayList<String>>();
       ArrayList<String> list = new ArrayList<String>();
       for(int i = 0; i < strs.length;++i){
           char[] arr = strs[i].toCharArray();
           Arrays.sort(arr);
           String copy = new String(arr);
           
           
           if(!table.contains(copy)){
               table.put(copy,new ArrayList<String>());
               table.get(copy).add(strs[i]);
           }
           else{
               table.get(copy).add(strs[i]);
           }
           //ArrayList<String> subList = new ArrayList<String>();
           //subList.add(strs[i]);
           ;
           
       }
       
       Set<String> set = table.keySet();
       Iterator<String> itr = set.iterator();
       while (itr.hasNext()){
          String num = itr.next();
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
        for(int i = 0; i < str.length(); i++)  
        {  
            hash = hash * a + str.charAt(i);  
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