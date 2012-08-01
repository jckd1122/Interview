import java.util.Stack;

public class canJump(){

    public boolean can(int[] A){
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 1; i <= A[0];++i){
            s.push(i);
        }
        while(!s.empty()){
            int pos = s.pop();
            if(pos == A.length-1)
                return true;
            else{
                for(int i = 1; i <= A[pos]; ++i){
                    s.push(pos+i);
                }
            }
        }
        return false;
    }





}
