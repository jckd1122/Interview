import java.lang.Math;
import java.util.Stack;

public class Solution {
   public static int longestValidParentheses(String s){
        int n = s.length();
        int maxSoFar = 0;
        int curEnd = 0;
        int start = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < n;++i){
            if(s.charAt(i) == '(' ){
                stack.push(i);
                continue;
            }
            if(stack.empty())
                start = n;
            if(!stack.empty()){
                start = Math.min(start,stack.peek());
                stack.pop();
                    
                if(stack.empty()){
                    curEnd = i-start+1;
                }
                else
                    curEnd = i-stack.peek();
            }    
            maxSoFar = Math.max(curEnd,maxSoFar);
        }
        return maxSoFar;
     }
}