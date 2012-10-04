public class Solution {
    public int firstMissingPositive(int[] A) {
       int n = A.length;
       if(n == 0)
           return 1;
       int[] arr = new int[n+1];    //same thing as using bit vector
       for(int i = 0; i < A.length;++i){
           if(A[i] > 0 && A[i] < n  && A[i] != arr[A[i]]){
               arr[A[i]] = A[i];
           } 
       
       }
       
       for(int i = 1;i < arr.length;++i){
           if(arr[i] != i)
               return i;
       }
       return n+1;
        
    }
    
   public int firstMissingPositive(int[] A) {
       int n = A.length;
       if(n == 0)
           return 1;
       for(int i = 0; i < A.length;++i){
           while(A[i] > 0 && A[i] < n  && A[i] != A[A[i]]){
               swap(A,i,A[i]);
           } 
       
       }
       
       for(int i = 1;i < A.length;++i){
           if(A[i] != i)
               return i;
       }
       return (A[0] == n) ? n+1 : n;
        
    }
    
    
    void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    
    }
 
}
