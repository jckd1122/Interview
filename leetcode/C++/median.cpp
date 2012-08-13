class Solution {
public:
    double findMedianSortedArrays(int A[], int m, int B[], int n) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int l = 0;
        int u = m-1;
        int p = 0;
        int q = n-1;
        int mid1,mid2,move;

        while(u > l && q > p){
            mid1 = (l+u)/2;
            mid2 = (p+q)/2;

            if(A[mid1] == B[mid2])
                return A[mid1];
            else if(A[mid1] > B[mid2]){
                if(A[mid1-1] < B[mid2+1])
                    return (A[mid1-1]+B[mid2+1])/2; 

                u = (mid1 < mid2)? mid1-1:mid2-1;
                p = (mid1 < mid2)? mid1+1:mid2+1;

            }
            else{
                if(A[mid1+1] > B[mid2-1])
                    return (A[mid1+1]+B[mid2-1])/2;
                u = (mid1 < mid2)? mid1+1:mid2+1;
                p = (mid1 < mid2)? mid1-1:mid2-1;
                
            }
        }
    }
};