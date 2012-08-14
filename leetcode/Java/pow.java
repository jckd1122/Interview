public class Solution{
    public double pow(double x, int n){
        double result = 1;
        if(n == 0)
            return 1.0;
        
        if(n%2 == 0){
            n /= 2;
            result = pow(x,n)*pow(x,n);
        }
        else{
            if( n > 0){
                n = (n-1)/2;
                 result = pow(x,n)*pow(x,n)*x;
            }
            else{
                n = (n+1)/2;
                result = pow(x,n)*pow(x,n)*1/x;
            }
        }
        return result;
    }
    
    


}
