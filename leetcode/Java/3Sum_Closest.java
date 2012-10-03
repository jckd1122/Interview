import java.util.*;
public class Solution{
     public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int sum = 0;
        int ans = 1000;
        for(int i = 0; i < num.length-2;++i){
            sum = target-num[i];
            int j = i+1;
            int k = num.length-1;
            int l,r = 0;
            int ret = 1000;
           
            while(j < k){
                if(num[j]+num[k] < sum){
                    l = num[j]+num[k]-sum;
                    j++;
                    if(-l < Math.abs(ret))
                        ret = l;
                }
                else if(num[j]+num[k] > sum){
                    r = num[j]+num[k]-sum;
                    k--;
                    if(r < ret)
                        ret = r;
                }
                else
                    return target;
           }
           ans = (Math.abs(ret) < Math.abs(ans))? ret:ans;
      }
      return ans+target;
        
    }

}
