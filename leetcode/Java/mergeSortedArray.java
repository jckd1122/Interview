public class Solution{
    public void merge(int[] A, int m, int[] B, int n){
        //copy array A's content to get out of merge place
        int h1 = n;
        int h2 = 0;
        int k = 0;
    
        if(m == 0 ){
            for(int i = 0; i < n;++i)
                A[i] = B[i];
            return;
        }
        
        for(int i = 0; i < m;++i)
            A[n+i] = A[i];
            
        while(k < m+n){
           if(A[h1] <= B[h2]){
               A[k++] = A[h1++];
           }
           else{
               A[k++] = B[h2++];
           }
                
        }


    }

   


}