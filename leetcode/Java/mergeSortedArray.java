public class Solution{
    public void merge(int[] A, int m, int[] B, int n){
        //copy array A's content to get out of merge place
        int h1 = 0;
        int h2 = 0;
        int k = 0;
        boolean isSwapped = false;
        if(m == 0 ){
            for(int i = 0; i < n;++i)
                A[i] = B[i];
            return;
        }
        for(int i = m; i < m+n;++i)
            A[i] = 1000;
        while(h1 < m+n && h2 < n){
            if(isSwapped){
                if(B[0] <= B[h2]){
                    swap(A,B,h1,0);
                    h1++;
                }
                else{
                    A[h1] = B[h2];
                    h2++;
                }
                continue;

            }

            if(A[h1] <= B[h2]){
                h1++;
            }
            else{
                swap(A,B,h1,0);
                isSwapped = true;
                h1++;
                h2++;
                
            }
                
        }


    }

    void swap(int[] arr1,int[] arr2, int i, int j){
        int tmp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j]= tmp;
    }


}