import java.util.*;
public class Solution {
     public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        int Sum = 0;
         for(int i = 0; i < num.length-2;++i){
            Sum = -num[i];
            int j = i+1;
            int k = num.length-1;
            ArrayList<Integer> ele = new ArrayList<Integer>(); 
            while(j < k){
               if(num[j]+num[k] == Sum){
                    ele.add(num[i]);
                    ele.add(num[j]);
                    ele.add(num[k]);
                    if(set.add(new ArrayList<Integer>(ele)))
                        ret.add(new ArrayList<Integer>(ele));
                    ele.clear();
                    k--;
                    j++;
                }
                else if(num[j]+num[k] > Sum)
                   k--;
                else
                    j++;
            }
        }
        return ret;
        
    }
}