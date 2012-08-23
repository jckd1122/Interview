public class Solution{
    public void merge(int[] A, int m, int[] B, int n){
        int h1 = n;
        int h2 = 0;
        int k = 0;
    
        //copy array A's content to get out of merge place
        int h1 = n;
        for(int i = m+n-1; i >= n;--i)
            A[i] = A[i-n];
            
        while(true){
            if(h1 == m+n){
                for(int i = h2; i < n;++i)
                    A[k++] = B[i];
                break;
            }
            if(h2 >= n){
                break;
            }

            if(A[h1] <= B[h2]){
               A[k++] = A[h1++];
            }
            else{
               A[k++] = B[h2++];
            }
        }
    }

}