public class Solution{
    public void rotate(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < n/2;++i){
            for(int j = i; j < n-i-1;j++){
                swap(matrix,i,j);     

            }
        
        }
    }

        //four way swap
    void swap(int[][] arr, int i, int j){
        int first = arr[i][j];
        int second = arr[j][n-i-1];
        int third = arr[n-i-1][n-j-1];
        int fourth = arr[n-j-1][i];

        int tmp1 = second;
        int tmp2 = fourth;
        second = first;
        fourth = third;
        first = tmp2;
        third = tmp1;
    }


    




}
