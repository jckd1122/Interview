
public class Solution {
    int maxRectangle(int x,int[][] arr){
        int l = 0;
        int r = arr[x].length-1;
        int height,width = 0;
        int area,areaMax = 0;
        while(l < r){
            height = Math.min(arr[x][l],arr[x][r])-1;
            width = r-l;
            area = height*width;
            areaMax =(area > areaMax)? area:areaMax;
            if(arr[x][l] < arr[x][r])
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
        int[][] arr = new int[m][n];
        
        //pre processing
        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                if(matrix[i][j] == '0')
                   arr[i][j] = 0;
                else{
                   if(i > 0)
                       arr[i][j] = arr[i-1][j]+1;
                   else
                       arr[i][j] = 1;
                   
                       
                }
            }
        }
        
        for(int i = 1; i < m;++i){
            area = maxRectangle(i,arr);
            areaMax =(area > areaMax)? area:areaMax;
        }
        return areaMax;
    }
    
    
    
    
}