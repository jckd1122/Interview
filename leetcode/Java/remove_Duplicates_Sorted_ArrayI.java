public class Solution {
    public int removeDuplicates(int[] A) {
        int n = A.length;
        if(n == 0)
            return 0;
            
        int head = 0;
        for(int i = 0; i < n;++i){
            if(A[head] == A[i])
                continue;
            else{
                head++;
                A[head] = A[i];
            }
        }
        return head+1;
    }
}
