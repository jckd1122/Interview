//be careful about the difference between with permutation and combination

import java.util.*;
public class Solution{
    public ArrayList<ArrayList<Integer> > subsets(int[] S){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        helper(list,buffer,0,S);
        return list;

    }

    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> buffer,int start,int[] S){
        list.add(new ArrayList<Integer>(buffer));

        
        for(int i = start; i < S.length;++i){
            buffer.add(S[i]);
            helper(list,buffer,i+1,S);
            buffer.remove(buffer.size()-1);

        }
        

    }

}