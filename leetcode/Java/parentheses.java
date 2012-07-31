
public class parentheses{
    
    public static ArrayList<String generateHelper(int n,ArrayList<String> parentSet){
        if(n == 1){
            parentSet.add("()");
            return parentSet;
        }
        else{
            for(int i = 0; i < parentSet.size();++i){
                String ele = parentSet.get(i);
                if(!parentSet.contains(ele+"()")
                    parentSet.add(ele+"()");
                if(!parentSet.contains("("+ele+")")
                    parentSet.add("("+ele+")");
                if(!parentSet.contains("()"+ele)
                    parentSet.add("()"+ele);
            }
            return parentSet;

        }
            


    }
    public static ArrayList<String> generate(int n){
        ArrayList<String> list = new ArrayList<String>();
        return generateHelper(n,list);
            
    }



}
