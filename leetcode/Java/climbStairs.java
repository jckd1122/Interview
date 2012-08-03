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
        arr[n] = climbStairs2(n-1)+climbStairs2(n-2);
        return arr[n];
    }


}

