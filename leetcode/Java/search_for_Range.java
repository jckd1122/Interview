public class Solution{
    public int[] searchRange(int[] A, int target){
        int l = 0;
        int u = A.length-1;
        int mid1,mid2;
        int mid = 0;
        boolean isFound = false;

        while(l <= u){
            mid = (l+u)/2;
            if(A[mid] == target){
                isFound = true;
                break;
            }
            else if(A[mid] > target)
                u = mid-1;
            else
                l = mid+1;
        }
        
        if(!isFound){
            int[] B = {-1,-1};
            return B;
        }

        mid1 = mid;
        mid2 = mid;
       
        while( l <= mid1){
            int p = (l+mid1)/2;
            if(A[p] < target)
                l = p+1;
            else
                mid1 = p-1;
    
        }
        
         while( u  >= mid2){
            int q = (mid2+u)/2;
            if(A[q] > target)
                u = q-1;
            else
                mid2 = q+1; 
        }

    
        int[] B = {l,u};
        return B;
        



    }



} 