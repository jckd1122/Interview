public class Solution{
    public ArrayList<String> letterCombinations(String digits){
        ArrayList<String> list = new ArrayList<String>();
        Vector<Character> generated = new Vector<Character>(); 
        //ArrayList<Character> letter = new ArrayList<Character>();
        //letter.add('a');
        //letter.add('b');
        //letter.add('c');
        combinationHelper(0,list,letter,digits);
        return list;
    }

    void combinationHelper(int depth,ArrayList<String> list,Vector<Character> generated,String digits){
        int l = digits.length();
        if( l == 0){
            list.add(generate(generated));
            return;
        }
        for(int i = 0; i < l;++i){
            // 2 and a 's difference is 47
            //char c = digits.charAt(i)+47; 
            for(int j = 0; j < 3;++j){
                generated.add(digits.charAt(i)+47+j);
                combinationHeloer(depth+1,list,letter,digits.substring(1));
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
