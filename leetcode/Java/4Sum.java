import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        int Sum3 = 0;
        int Sum2 = 0;
        for(int i = 0; i < num.length-3;++i){
            Sum3 = target-num[i];
           
            
            for(int j = i+1; j < num.length-2;++j){
                Sum2 = Sum3-num[j]; 
                int k = j+1;
                int l = num.length-1;
                
                while(k < l){
                    ArrayList<Integer> ele = new ArrayList<Integer>();
                    if(num[k]+num[l] == Sum2){
                        ele.add(num[i]);  
                        ele.add(num[j]);
                        ele.add(num[k]);
                        ele.add(num[l]);
                        if(set.add(ele))
                            list.add(ele);
                        k++;
                        l--;
                             
                    }
                    else if(num[k]+num[l] < Sum2)
                        k++;
                    else
                        l--;
                
                }
            
            }
        
        }
        return list;
        
    }
}