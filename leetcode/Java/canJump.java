import java.util.Stack;

public class canJump(){

    public boolean can1(int[] A){
        if(A.length == 1)
            return true;
            
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 1; i <= A[0];++i){
            s.push(i);
        }
        while(!s.empty()){
            int pos = s.pop();
            if(pos == A.length-1)
                return true;
            else if(pos < A.length-1){
                for(int i = 1; i <= A[pos]; ++i){
                    s.push(pos+i);
                }
            }
        }
        return false;
    }


    Public boolean can2(int[] A){
       int n = A.length;
        if(n == 1)
            return true;
        if(A[0] == 0)
            return false;

        for(int i = 1; i < n-1;++i){
            if(A[i] != 0)
                continue;
            for(int j = 0,step = i; j < i;j++,step--){
                if(A[j] > step)
                    break;
                else if(j < i-1)
                    continue;
                else
                    return false;
            }
            
        }
        return true;
    }

    Public boolean can3(int[] A){
        int furthest = 0;
        int n = A.length;
        for(int i = 0; i < n;++i){
            int pos = i+A[i];
            if(pos > furthest)
                furthest = tmp;
            if(furthest >= n-1)
                return true;
            if(furthest == i)
                return false;
         }

    }


}
