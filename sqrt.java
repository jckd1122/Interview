public class Solution{
    public int sqrt(int x){
        if(x >= 0 && x <= 1)
            return x;

        int low = 2;
        int hi= x;
        while(low <= hi){
            int mid =(low+hi)/2;
            if(mid*mid == x)
                return mid;
            else if(mid*mid > x)
                hi = mid-1;
            else
                low = mid+1;

        }


    }


}
