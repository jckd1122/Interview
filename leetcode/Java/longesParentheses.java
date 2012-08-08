import java.lang.Math;
import java.util.Stack;

public class longestParentheses{
    public int longestValidParentheses(String s){
        int n = s.length();
        int maxSoFar = 0;
        int prevEnd = 0;
        int curEnd = 0;
        Stack<Character> stack = new Stack<Character>();
        if(n == 0) return 0;
        for(int = 0; i < n;++i){
            if(s.charAt(i) == '{'){
                prevEnd = curEnd;
                curEnd = 0;
                stack.clear();
                stack.push('{');
            }
            else{
                stack.pop();
                curEnd++;
                if(stack.empty())
                    curEnd = curEnd+prevEnd;
                else
                    current = max(curEnd,prevEnd);
            }
            maxSoFar = max(max(curEnd,prevEnd),maxSoFar);

        }
        return maxSoFar;



    }


}
