

public class mostWater{
	
	
	public static int  maxArea1(int[] height){
		int length = 0;
		int width = 0;
		int area = 0;
		int areaMax = 0;
		for(int i = 0; i < height.length;++i){
			for(int j = i+1; j < height.length;++j){
				length = j-i;
				width = (height[j] > height[i])? height[i]:height[j];
				area = length*width;
				if(area > areaMax)
					areaMax = area;
				
			}
		}
		return areaMax;
		
		
	}
	
	public static int  maxArea2(int[] height){
		int length = 0;
		int width = 0;
		int area = 0;
		int areaMax = (height.length-1)*Math.min(height[l], height[r]); 
		int l = 0;
		int r = height.length-1;
		while(l < r){
			if(height[l] <= height[r]){
				width = (height[l+1] > height[r])? height[l+1]:height[r];
				area = (r-l-1)*width;
				areaMax = Math.max(areaMax, area);
				l++;
			}
			else{
				width = (height[l] > height[r-1])? height[r-1]:height[l];
				area = (r-l-1)*width;
				areaMax = Math.max(areaMax, area);
				r--;
			}
		}
		return areaMax;
	}
	
	
	public static int maxArea3(int[] height){
		int[] arr = new int[height.length];
		//hashtable?
		for(int i = 0; i < height.length;++i){
			
		}
	}
}
