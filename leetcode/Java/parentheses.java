import java.util.*;

public class Solution {
    public ArrayList<String> generateParenthesis1(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
        return generateHelper1(n,list);
    }
    
    
    public ArrayList<String> generateHelper1(int n,ArrayList<String> parentSet){
        if(n == 1){
            parentSet.add("()");
            return parentSet;
        }
        else{
            parentSet = generateHelper1(n-1,parentSet);
            for(int i = 0; i < parentSet.size();++i){
                String ele = parentSet.get(i);
                if(!parentSet.contains(ele+"()"))
                    parentSet.add(ele+"()");
                if(!parentSet.contains("("+ele+")"))
                    parentSet.add("("+ele+")");
                if(!parentSet.contains("()"+ele))
                    parentSet.add("()"+ele);
            }
            return parentSet;

        }
    }

   


    public ArrayList<String> generateParenthesis2(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
        return generateHelper2(n,0,0,list,"");

    }
    
    public void generateHelper2(int n,int left,int right,ArrayList<String> parentSet,String printOut){
        if(left == n && right == n)
            parentSet.add(printOut);
        else{
            if(left < n){
                generateHelper2(n,left+1,right,parentSet,printOut+"(");
            }
            if(left > right){
                generateHelper2(n,left,right+1,parentSet,printOut+")");
            }
        }

    }



}
