public class Solution{
    public boolean isPalindrome(int x){
        if(x < 0)
            return false;       
        
        int len = 0;
        int head = 0;
        int tail = 0;
        while((int)(x/Math.pow(10,len)) > 0){
            len++;
        }
        
        for(int i = 0; i < len/2;++i){
            head = (x/(int)Math.pow(10,len-i-1))%10;
            tail = (x/(int)Math.pow(10,i))%10;
            if(head != tail)
                return false;
        }
        return true;
    }

}