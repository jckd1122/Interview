import java.lang.Math;
import java.util.Stack;

public class l{
    public static int longestValidParentheses(String s){
        int n = s.length();
        int maxSoFar = 0;
        int prevEnd = 0;
        int curEnd = 0;
        Stack<Character> stack = new Stack<Character>();
        if(n == 0) return 0;
        for(int i = 0; i < n;++i){
            if(s.charAt(i) == '('){
                prevEnd = curEnd;
                curEnd = 0;
                stack.clear();
                stack.push('(');
            }
            else{
                if(stack.empty())
                    curEnd = curEnd+prevEnd;
                else{
                    stack.pop();
                    curEnd =curEnd+2;
                    curEnd = Math.max(curEnd,prevEnd);
                }
            }
            maxSoFar = Math.max(Math.max(curEnd,prevEnd),maxSoFar);

        }
        return maxSoFar;

    }

    public static void main(String[] args){
        String s = "()(())";
        System.out.println(longestValidParentheses(s));

    }




}
