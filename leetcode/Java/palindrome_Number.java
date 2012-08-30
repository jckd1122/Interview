public class Solution{
    public boolean isPalindrome(int x){
        if(x < 0)
            return isPalindrome(-x);
        
        int remain = 0;
        int tail = 0;
        int count = 0;
        while(x/10 > 0){
            tail = x%10;
            x /= 10;
            remain = (int)Math.pow(10,count)+remain;
            count++;
        }

        count--;
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