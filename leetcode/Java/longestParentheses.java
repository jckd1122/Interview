import java.lang.Math;
import java.util.Stack;

public class l {
     public static int longestValidParentheses(String s){
        int n = s.length();
        int maxSoFar = 0;
        int curEnd = 0;
        int start = n+1;
        Stack<Integer> stack = new Stack<Integer>();

        if(n == 0) return 0;
        for(int i = 0; i < n;++i){
            //prevEnd = (curEnd == 0)? 0:curEnd;
            if(s.charAt(i) == '(' ){
                stack.push(i);
                continue;
            } 
            
            if(!stack.empty()){
                //start = Math.min(stack.peek(),start);
                stack.pop();
                    
                if(!stack.empty())
                    curEnd = i-stack.peek();
                else
                    curEnd = i-start+1;
                
            }    
            
            maxSoFar = Math.max(curEnd,maxSoFar);
        
        }
        return maxSoFar;
     }


    public static void main(String[] agrs){
        String s = ")(((((()())()()))()(()))(";
        System.out.println(longestValidParentheses(s));

    }
}
