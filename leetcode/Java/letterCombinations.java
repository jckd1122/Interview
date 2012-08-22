import java.util.*;
public class letterCombinations{
    public static ArrayList<String> letterCombinations(String digits){
        ArrayList<String> list = new ArrayList<String>();
        Vector<Character> generated = new Vector<Character>(); 
        combinationHelper(0,list,generated,digits);
        return list;
    }

    static void combinationHelper(int depth,ArrayList<String> list,Vector<Character> generated,String digits){
        int l = digits.length();
        if(l == 0){
            list.add(generate(generated));
            return;
        }
        
<<<<<<< HEAD
            // 2 and a 's difference is 47
            //char c = digits.charAt(i)+47; 
        int k;
        for(int i = 0; i < 3;++i){
            k = digits.charAt(0)-'2';
            //char c = (char)(digits.charAt(0)+47+2*k+i);
            char c = 'a';
            generated.add(Character.valueOf(c));
            combinationHelper(depth+1,list,generated,digits.substring(1));
            generated.remove(generated.size()-1);
=======
        int k;    
        if(digits.charAt(0) == '7' || digits.charAt(0) == '9'){
            for(int i = 0; i < 4;++i){
                char c = (digits.charAt(0) == '7')? (char)('p'+i):(char)('w'+i);
                generated.add(Character.valueOf(c));
                combinationHelper(depth+1,list,generated,digits.substring(1));
                generated.remove(generated.size()-1);
>>>>>>> 0899fbe1a71aed2fad955eabd5a3edaf2917a690
            
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

    static String generate(Vector<Character> generated){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < generated.size();++i)
            builder.append(generated.get(i));
        return builder.toString();
    }
<<<<<<< HEAD


    public static void main(String[] args){
        letterCombinations("23");


    }


}
=======
}
>>>>>>> 0899fbe1a71aed2fad955eabd5a3edaf2917a690
