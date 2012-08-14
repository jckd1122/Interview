public class Solution{
    public double pow(double x, int n){
        double result = 1;
        if(n == 0)
            return 1.0;
        while(n > 0){
            result *= x;
            n--;
        }
        
        while(n < 0){
            result *= 1/x;
            n++;
        }
        return result;
    }


}
