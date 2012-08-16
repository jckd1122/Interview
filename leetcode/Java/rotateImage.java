// this requires some observation about the rotation can be transformed into a four swap problem

public class Solution{
    public void rotate(int[][] matrix){
        int n = matrix[0].length;
        
        for(int i = 0; i < n/2;++i){
            for(int j = i; j < n-i-1;j++){
                swap(matrix,i,j);     
            }
        }
    }
    //four way swap
    void swap(int[][] arr, int i, int j){
        int n = arr[0].length;
        int first = arr[i][j];
        int second = arr[j][n-i-1];
        int third = arr[n-i-1][n-j-1];
        int fourth = arr[n-j-1][i];

        int tmp1 = second;
        int tmp2 = fourth;
        arr[j][n-i-1]= first;
        arr[n-j-1][i] = third;
        arr[i][j] = tmp2;
        arr[n-i-1][n-j-1] = tmp1;
    }


    




}