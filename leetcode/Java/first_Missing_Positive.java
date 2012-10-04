public class Solution {
    public int firstMissingPositive(int[] A) {
       int n = A.length;
       if(n == 0)
           return 1;
       int[] arr = new int[n+1];
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
    
   
 
}
