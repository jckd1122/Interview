public class Solution {
    public int largestRectangleArea(int[] height) {
       Stack<Integer> s = new Stack<Integer>();
       Stack<Integer> ht = new Stack<Integer>();
       if(height.length == 0) 
           return 0;
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
}
