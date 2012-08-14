public class Solution{
    public double pow(double x, int n){
        double result = 1;
        double tmp;
        if(n == 0)
            return 1.0;
        
        if(n%2 == 0){
            n /= 2;
            tmp = pow(x,n);
            result = tmp*tmp;
        }
        else{
            if( n > 0){
                n = (n-1)/2;
                tmp = pow(x,n);
                 result = tmp*tmp*x;
            }
            else{
                n = (n+1)/2;
                tmp = pow(x,n);
                result = tmp*tmp*1/x;
            }
        }
        return result;
    }
    
    


}