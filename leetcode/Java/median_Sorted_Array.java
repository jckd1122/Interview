
public class Solution{
    public double findMedianSortedArrays(int A[],int B[]){
        int m = A.length;
        int n = B.length;
        if( m > n)
            return findMedianSortedArrays(B,A);

        if(m == 0)
            return (n%2 == 0)? (B[n/2]+B[n/2-1])/2:B[n/2];
        
        int l1 = 0;
        int h1 = m-1;
        int l2 = 0;
        int h2 = n-1;
        int c1 = (m%2 == 0) (A[m/2]+A[m/2-1])/2:A[m/2];
        int c2 = (n%2 == 0) (B[n/2]+B[n/2-1])/2:B[n/2];
        
        while(l1 <= h1 && l2 <= h2){
            int mid1 = (l1+h1)/2;
            int mid2 =(l2+h2)/2;
            int c1 = ((h1-l1+1)%2 == 0)? (A[mid1]+A[mid1-1])/2:A[mid1];
            int c2 = ((h2-l2+1)%2 == 0)? (B[mid2]+B[mid2-1])/2:B[mid2];
            if(c1 == c2{
                return mid1;        
            }
            else if(c1 < c2){
                l1 = mid+1;
                h2 = 2mid2+mid1-l2-h1-1;
            }
            else{
                h1 = mid-1;
                l2 = 2mid2-mid1+l1-h2-1;
            }
        }
        return (l1 > h1)? A[(l1+h1)/2]:B[(l2+h2)/2];





    }




}
