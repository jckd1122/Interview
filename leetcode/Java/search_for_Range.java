public class Solution{
    public int[] searchRange(int[] A, int target){
        int l = 0;
        int u = A.length-1;
        int mid1,mid2;
        int mid = 0;
        boolean isFound = false;

        while(l < u){
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
        while( l < mid1){
            mid1 = (l+mid1)/2;
            if(A[mid1] < target)
                l = mid1+1;
    
        }
        
        while( u  > mid2){
            mid2 = (mid2+u)/2;
            if(A[mid2] > target)
                u = mid2-1;
        }

    
        int[] B = {l,u};
        return B;
        



    }



} 