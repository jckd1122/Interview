import java.util.*;
public class Solution{
    public ArrayList<String> letterCombinations(String digits){
        ArrayList<String> list = new ArrayList<String>();
        Vector<Character> generated = new Vector<Character>(); 
        //ArrayList<Character> letter = new ArrayList<Character>();
        //letter.add('a');
        //letter.add('b');
        //letter.add('c');
        combinationHelper(0,list,generated,digits);
        return list;
    }

    void combinationHelper(int depth,ArrayList<String> list,Vector<Character> generated,String digits){
        int l = digits.length();
        if(l == 0){
            list.add(generate(generated));
            return;
        }
        
            // 2 and a 's difference is 47
            //char c = digits.charAt(i)+47; 
        int k;
        for(int i = 0; i < 3;++i){
            k = digits.charAt(i)-'2';
            //char c = (char)(digits.charAt(0)+47+2*k+i);
            char c = 'a';
            generated.add(Character.valueOf(c));
            combinationHelper(depth+1,list,generated,digits.substring(1));
            generated.remove(generated.size()-1);
            
        }
    }

    String generate(Vector<Character> generated){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < generated.size();++i)
            builder.append(generated.get(i));
        return builder.toString();
    }


}