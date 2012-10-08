public class Solution {
    int maxRectangle(int[] height){
       Stack<Integer> s = new Stack<Integer>();
       Stack<Integer> ht = new Stack<Integer>();
       if(height.length == 0) return 0;
       int area,areaMax = 0;
       int last = 0;
       s.push(0);
       ht.push(height[0]);
       
       for(int i = 1; i < height.length;++i){
           if(height[i] > height[i-1]){
               s.push(i);
               ht.push(height[i]);
           }
           if(height[i] < height[i-1]){
               while(!ht.empty() && ht.peek() >= height[i]){
                   last = s.peek();
                   area = ht.peek()*(i-s.pop());
                   ht.pop();
                   areaMax = Math.max(area,areaMax);
               }
               s.push(last);
               ht.push(height[i]);
           }
       
       }
       
       while(!ht.empty()){
           area = ht.pop()*(height.length-s.pop());
           areaMax = Math.max(area,areaMax);
            
       }       
       return areaMax;
    
    }
    
    public int maximalRectangle(char[][] matrix) {
        int area,areaMax = 0;
        int m = matrix.length;
        if(m == 0) return 0;
        int n = matrix[0].length;
        int[] arr = new int[n];
        
      
        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                if(matrix[i][j] == '0')
                    arr[j] = 0;
                else
                    arr[j]++; 
            }
            area = maxRectangle(arr);
            areaMax =(area > areaMax)? area:areaMax;
        }
        
       
        return areaMax;
    }
    
    
    
    
}