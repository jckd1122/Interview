import java.util.*;
public class Solution{
    public ArrayList<ArrayList<Integer> > subsets(int[] S){
        int l = S.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(l == 0)
            return list;

        
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        helper(list,buffer,0,S);
        return list;

    }

    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> buffer,int start,int[] S){
        list.add(new ArrayList<Integer>(buffer));

        
        for(int i = start; i < S.length;++i){
            buffer.add(S[i]);
            helper(list,buffer,i+1,length,S);
            buffer.remove(buffer.size()-1);

        }
        

    }

}