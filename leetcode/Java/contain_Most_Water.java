public class Solution {
    public static int  maxArea(int[] height){
        int h,width,area,areaMax = 0;
        int l = 0;
        int r = height.length-1;
        while(l < r){
             h = Math.min(height[l],height[r]);
             width = r-l;
             area = h*width;
             if(area > areaMax)
                 areaMax = area;
            if(height[l] < height[r])
                l++;
            else
                r--;    
        }
        return areaMax;
    }
}


