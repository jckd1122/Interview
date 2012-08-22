import java.util.*;
public class Solution{
    public ArrayList<String> letterCombinations(String digits){
        ArrayList<String> list = new ArrayList<String>();
        Vector<Character> generated = new Vector<Character>(); 
        combinationHelper(0,list,generated,digits);
        return list;
    }

    void combinationHelper(int depth,ArrayList<String> list,Vector<Character> generated,String digits){
        int l = digits.length();
        if(l == 0){
            list.add(generate(generated));
            return;
        }
        
        int k;    
        if(digits.charAt(0) == '7' || digits.charAt(0) == '9'){
            for(int i = 0; i < 4;++i){
                char c = (digits.charAt(0) == '7')? (char)('p'+i):(char)('w'+i);
                generated.add(Character.valueOf(c));
                combinationHelper(depth+1,list,generated,digits.substring(1));
                generated.remove(generated.size()-1);
            
            }
            
        }
        
       else{
            for(int i = 0; i < 3;++i){
                k = digits.charAt(0)-'2';
                char c = (digits.charAt(0) == '8')?  (char)(digits.charAt(0)+47+2*k+i+1):(char)(digits.charAt(0)+47+2*k+i);
                generated.add(Character.valueOf(c));
                combinationHelper(depth+1,list,generated,digits.substring(1));
                generated.remove(generated.size()-1);
            
            }
        }
    }

    String generate(Vector<Character> generated){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < generated.size();++i)
            builder.append(generated.get(i));
        return builder.toString();
    }
}