public class Solution{
    public double pow(double x, int n){
        double tmp,a;
        if(n < 0)
            return 1/pow(x,-n);
        if(n == 0)
            return 1.0;
        
        a = (n%2 == 1)? x:1;
        n /= 2;
        tmp = pow(x,n);
        return tmp*tmp*a;
    }
}
