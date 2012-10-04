public class Solution {
    public String addBinary(String a, String b) {
        int m = Math.max(a.length(),b.length());
        int n = Math.min(a.length(),b.length());
        int adder = 0;
        int sum,num1,num2,num3 = 0;
        String ret = "";
        for(int i = n-1, j = m-1; i >= 0; --i,--j){
            if(a.length() > b.length())
                num1 = b.charAt(i)-'0';
                num2 = a.charAt(j)-'0';
            }
            else{
                num1 = a.charAt(i)-'0';
                num2 = b.charAt(j)-'0';
            }
            sum = num1+num2+adder;
             if( sum >= 2){
                adder = 1;
                ret = (char)(sum-2+'0')+ret;
              }
            else{
                adder = 0;
                ret = (char)(sum+'0')+ret;
            }            
        }
         
        for(int i = m-n-1; i >= 0;--i){
            if(a.length() > b.length())
                num3 = a.charAt(i)-'0';
            else
                num3 = b.charAt(i)-'0';
            sum = num3+adder;
            if( sum >= 2){
                adder = 1;
                ret = (char)(sum-2+'0')+ret;
              }
            else{
                adder = 0;
                ret = (char)(sum+'0')+ret;
            }            
            
        }
        if(adder == 1)
            ret = (char)(1+'0')+ret;
        return ret;
        
    }
}