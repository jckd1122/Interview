public class Solution{
    public boolean isPalindrome(int x){
        if(x < 0)
            return isPalindrome(-x);
        
        int remain = 0;
        int num = x;
        //int tail = 0;
        int count = 0;
        while(x > 0){
            x /= 10;
            count++;
        }
        remain = num-x*Math.pow(10,count);

        while(remain >= 10){
            if(x != remain%10)
                return false;
            x = remain/(int)Math.pow(10,count);
            remain = remain-x*(int)Math.pow(10,count);
            count -= 2;
            remain /= 10;

        }
        return true;


    }



}