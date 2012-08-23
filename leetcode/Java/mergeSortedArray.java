public class mergeSortedArray{
    public static void merge(int[] A, int m, int[] B, int n){
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
            
        while(true){
            if(h1 >= m+n){
                for(int i = h2; i < n;++i)
                    A[k++] = B[i];
                break;
            }
            if(h2 >= n){
                for(int i = h1; i < m+n;++i)
                    A[k++] = A[i];
                break;
            }

            if(A[h1] <= B[h2]){
               A[k++] = A[h1++];
            }
            else{
               A[k++] = B[h2++];
            }
                
        }


    }

    public static void main(String[] args){
        int[] A = {1,2,3,0,0,0};
        int[] B = {4,5,6};
        merge(A,3,B,3);

    }

   


}
