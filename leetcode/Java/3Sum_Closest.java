import java.util.*;
public class Solution{
     public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int sum = 0;
        int result = 0;
        int ans = 1000;
        for(int i = 0; i < num.length-2;++i){
            sum = target-num[i];
            int j = i+1;
            int k = num.length-1;
            int l,r = 0;
            int ret1 = -1000;
            int ret2 = 1000;
           
            while(j < k){
                if(num[j]+num[k] < sum){
                    l = num[j]+num[k]-sum;
                    j++;
                    if(l > ret1)
                        ret1 = l;
                }
                else if(num[j]+num[k] > sum){
                    r = num[j]+num[k]-sum;
                    k--;
                    if(r < ret2)
                        ret2 = r;
                }
                else{
                    return target;
                }
           
           
            }
           result = (Math.abs(ret1) < Math.abs(ret2))? ret1:ret2;
           ans = (Math.abs(result) < Math.abs(ans))? result:ans;
              
          
      }
      return ans+target;
        
    }

}
