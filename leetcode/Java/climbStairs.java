public class climbStairs{
    private int[] arr;
    //naive recursion
    public int climbStairs1(int n){
        if (n < 3)
            return n;
        return climbStairs1(n-1)+climbStairs1(n-2);
    }

    //DP Top down
    public int climbStairs2(int n){
        if( n < 3)
            arr[n] = n;
        if(arr[n] == 0)
            arr[n] = climbStairs2(n-1)+climbStairs2(n-2);
        else
            return arr[n];
    }
    
    //DP bottom up
    public int climbStairs(int n){
        if(n == 0)
            return 0
        int temp1 = 0;
        int temp2 = 1;
        for(int i = 1; i <= n;++i){
            temp2 = temp1+temp2;
            temp1 = temp2-temp1;
        }
        return temp2;
        
        
    }


}

