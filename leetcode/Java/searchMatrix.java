
public classs Solution{
    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] arr = new int[m*n-1];
        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                arr[n*i+j] = matrix[i][j];
            }
        }
        return (binarySearch(arr,target) == -1)? false:true;
    }

    int binarySearch(int[] arr, int target){
        int l = 0;
        int u = arr.length-1;
        int mid;

        while(l <= u){
            mid = (l+u)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                u = mid-1;
            else
                l = mid+1;
        }
        return -1;
    }




}
