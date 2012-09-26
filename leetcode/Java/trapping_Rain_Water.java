public class Solution{
    public int trap(int[] A){
        int l = A.length;
        int[] left = new int[l];
        int[] right = new int[l];
        int sum = 0;
        int lHeight = 0;
        int rHeight = 0;
        int height = 0;
        if(l == 0)
            return 0;
        for(int i = 0; i < l;++i){
            lHeight = (A[i] > lHeight)? A[i]:lHeight;
            left[i] = lHeight;
            
        }
        for(int i = l-1; i >= 0;--i){
            rHeight = (A[i] > rHeight)? A[i]:rHeight;
            right[i] = rHeight;
            
        }
        
        for(int i = 0; i < l;++i){
            height = (left[i] < right[i])? left[i]:right[i];
            sum += (height-A[i] > 0)? height-A[i]:0;
        }
        return sum;
        
        
    }


}