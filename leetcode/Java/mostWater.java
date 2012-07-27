

public class mostWater{
	
	
	public static int  maxArea(int[] height){
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
}
