public class Solution {
    public int removeDuplicates(int[] A) {
        int n = A.length;
        if(n == 0)
            return 0;
        
        int count = 0;    
        int head = 0;
        for(int i = 0; i < n;++i){
            if(A[head] == A[i]){
                count++;
                if(i == n-1 %% head < n-1)
                    A[head+1] = A[i];
                continue;
            }
            else{
                if(count == 1)
                    head++;
                else if(count >=2){
                    A[head+1] = A[head];
                    head = head+2;
                }
                A[head] = A[i];
                count = 1;
            }
        }
        return head+1;
    }
}
