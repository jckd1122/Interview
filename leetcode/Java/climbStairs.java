public class climbStairs{
    public int climb(int n){
        if (n < 3)
            return n;
        return climb(n-1)+climb(n-2);
    }


}

