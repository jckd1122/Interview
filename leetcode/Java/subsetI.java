import java.util.*;

public class subsetI{
    public static ArrayList<ArrayList<Integer> > subsets(int[] S){
        int l = S.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(l == 0)
            return list;

        for(int i = 1; i <=l;++i){
            ArrayList<Integer> buffer = new ArrayList<Integer>();
            for(int j = 0; j < l;++j){
                helper(list,buffer,j,i,S);
            }

        }
        return list;

    }

    static void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> buffer,int pos,int length,int[] S){
        if(buffer.size() == length){
            list.add(buffer);
            return;
        }

        
        for(int i = pos; i < S.length;++i){
            buffer.add(S[i]);
            helper(list,buffer,i+1,length,S);
            buffer.remove(buffer.size()-1);

        }

    }

    public static void main(String[] args){
        int[] S = {1,2,3};
        //ArrayList<ArrayList<Integer>> list = subsets(S);
        System.out.println(subsets(S).size());
        for(int i = 0; i < subsets(S).size();++i){
            for(int j = 0; j < subsets(S).get(i).size();++j){
                System.out.print(subsets(S).get(i).get(j));
            }
            System.out.println();

        }


    }



}
