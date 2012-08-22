public class Solution{
    public void merge(int[] A, int m, int[] B, int n){
        //copy array A's content to get out of merge place
        for(int i = 0; i < m;++i)
            A[i+n+m] = A[i];
        int h1 = m+n;
        int h2 = 0;
        int k = 0;
        while(k++ < m+n){
            A[k] = (A[h1] <= B[h2])? A[h1++]:B[h2++];
        }


    }


}
