public class Solution{
    public void merge(int[] A, int m, int[] B, int n){
        //copy array A's content to get out of merge place
<<<<<<< HEAD
        int h1 = 0;
=======
        for(int i = 0; i < m;++i)
            A[i+m] = A[i];
        int h1 = m;
>>>>>>> afed4dc3c23ab0b2c452e6daea2e2088d1a5421d
        int h2 = 0;
        int k = 0;
        boolean isSwapped = false;
        while(k++ < m+n){
            if(isSwapped){
                if(B[0] <= B[h2]){
                    swap(A,B,h1,0);
                }
                else{
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
                A[h1] = B[h2];
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
