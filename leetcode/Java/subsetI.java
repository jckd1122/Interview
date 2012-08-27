public class Solution{
    public ArrayList<ArrayList<Integer> > subsets(int[] S){
        int l = s.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(l == 0)
            return list;

        for(int i = 1; i <=l;++i){
            ArrayList<Integer> buffer = new ArrayList<Integer>();
            for(int j = 0; j <= l-i;++j){
                helper(list,buffer,j,i,S);
            }

        }


    }

    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> buffer,int pos,int length,int[] S){
        if(buffer.size() == length){
            list.add(buffer);
            buffer.clear();
            return;
        }

        buffer.add(S[i]);
        for(int i = pos+1; i <= l-(length-buffer.size());++i){
            helper(list,buffer,i,length,S);

        }

    }



}
