public class Solution{
    public boolean isPalindrome(int x){
        if(x <= 0)
            return false;
        
        int len = 0;
        int head = 0;
        int tail = 0;
        while(x/(int)Math.pow(10,len))
            len++;

        for(int i = 0; i < len/2;++i){
            head = x/(int)Math.pow(10,len-i);
            tail = x%10;
            if(head != tail)
                return false;
        }
        return true;


    }



}
