import java.lang.Math;
import java.util.Stack;

public class l {
     public static int longestValidParentheses(String s){
        int n = s.length();
        int maxSoFar = 0;
        int prevEnd = 0;
        int curEnd = 0;
        Stack<Character> stack = new Stack<Character>();
        if(n == 0) return 0;
        for(int i = 0; i < n;++i){
            prevEnd = (curEnd == 0)? 0:curEnd;
            if(s.charAt(i) == '('){
                curEnd = 0;
                stack.push('(');
            } 
            else{
                if(!stack.empty()){
                    stack.pop();
                    curEnd = curEnd+2;
                    //System.out.println("test "+curEnd);
                }
                //if(stack.empty())
                //    curEnd = curEnd+prevEnd;
            }    
            curEnd = Math.max(curEnd,prevEnd);
            
            System.out.println("test "+curEnd);
            maxSoFar = Math.max(curEnd,maxSoFar);
        
        }
        return maxSoFar;
     }


    // public static void main(String[] agrs){
    //    String s = "(()())";
    //    System.out.println(longestValidParentheses(s));

    //}
}
