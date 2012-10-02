import java.util.*;
public class Solution {
     public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int Sum = 0;
         for(int i = 0; i < num.length-2;++i){
            Sum = -num[i];
            int j = i+1;
            int k = num.length-1;
            int prevLo = -1000;
            int prevHi = 1000;
            ArrayList<Integer> ele = new ArrayList<Integer>(); 
            while(j < k){
                if(num[j] == prevLo)
                    j++;
                   
                if(num[k] == prevHi)
                    k++;
                  
                
                if(num[j]+num[k] == Sum){
                    ele.add(num[i]);
                    ele.add(num[j]);
                    ele.add(num[k]);
                    list.add(new ArrayList<Integer>(ele));
                    ele.clear();
                    k--;
                    j++;
                    
                }
                else if(num[j]+num[k] > Sum){
                   
                    k--;
                }
                else{
                    
                    j++;
                }  
                if(j < num.length)
                    prevLo = num[j-1];
                if(k > i+1)
                    prevHi= num[k+1]; 
                
            }
            
           
            
        }
               
            
        return list;
        
    }
}