public class Solution{
    public int sqrt(int x){
        int low = 0;
        int hi = x;
        int mid = 0;
        int ret = 0;
        while(low <= hi){
            mid = low + (hi-low)/ 2;
            if (mid > 46340) {         			// 46340^2 ~= INT_MAX
	    	hi = mid - 1;
		continue;
	    }

            if(mid*mid == x)
                return mid;
            else if(mid*mid > x)
                hi = mid-1;
            else{
                low = mid+1;
                ret = mid;
            }

        }
        return ret;
        
    }


}