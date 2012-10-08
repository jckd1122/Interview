public class Solution {
    int maxRectangle(int[] arr){
        int l = 0;
        int r = arr.length-1;
        int height,width = 0;
        int area,areaMax = 0;
        while(l < r){
            height = Math.min(arr[l]-1,arr[r]-1);
            width = r-l;
            area = height*width;
            areaMax =(area > areaMax)? area:areaMax;
            if(arr[l] < arr[r])
                l++;
            else
                r--;
        
        }    
        return areaMax;
    
    
    }
    
    public int maximalRectangle(char[][] matrix) {
        int area,areaMax = 0;
        int m = matrix.length;
        if(m == 0) return 0;
        int n = matrix[0].length;
        int[] arr = new int[n];
        
        //pre processing
        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                if(matrix[i][j] == '0')
                    arr[j] = 0;
                else
                    arr[j]++; 
            }
            area = maxRectangle(i,arr);
            areaMax =(area > areaMax)? area:areaMax;
        }
        
       
        return areaMax;
    }
    
    
    
    
}