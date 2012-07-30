public class mostWater{
	
	
	public static int  maxArea1(int[] height){
		int length = 0;
		int width = 0;
		int area = 0;
		int areaMax = 0;
		for(int i = 0; i < height.length;++i){
			for(int j = i+1; j < height.length;++j){
				//length = j-i;
				//width = (height[j] > height[i])? height[i]:height[j];
				if(height[j] > height[i])
					continue;
				area = length*height[i];
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
		width = (height[l] > height[r])? height[r]:height[l];
		int areaMax = (height.length-1)*width;
		while(l < r){
			if(height[l] <= height[r]){
				width = (height[l+1] > height[r])? height[l+1]:height[r];
				area = (r-l-1)*width;
				if(area > areaMax)
                    areaMax = area;
				l++;
			}
			else{
				width = (height[l] > height[r-1])? height[r-1]:height[l];
				area = (r-l-1)*width;
				areaMax = Math.max(areaMax, area);
				if(area > areaMax)
                    areaMax = area;
				r--;
			}
		}
		return areaMax;
	}
	
	
	
}
