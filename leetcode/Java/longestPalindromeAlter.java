import java.lang.String;

public class longestPalindromeAlter{
    public static String longestPalindrome(String s){
        int l = s.length();
        int maxSoFarOdd = 0;
        int maxSoFarEven = 0;
        int curEnd = 0;
        int p = 0;  //start index for masSoFar
        int q = 0;
        int m = 0;  //start index for curEnd
        int n = 0;
        for(int i = 0; i < l;++i){
            if(m >= 1){
                if(s.charAt(i) == s.charAt(m-1)){
                    if(m >= 1){
                        m--;
                        n++;
                    }
                }
                else{
                    m = i+1;
                    n = i+1;
                }
            }
            curEnd = n-m+1;
            if(curEnd > maxSoFarOdd){
                p = m;
                q = n;
                maxSoFarOdd = q-p+1;
            }
        }

        int p1 = 0;
        int q1 = 0;
        int m1 = 1;
        int n1 = 0;
        curEnd = 0;

        
        for(int i = 0; i < l;++i){
            if(s.charAt(i) == s.charAt(m1)){
                if(m1 >= 1){
                    m1--;
                    n1++;
                }
            }
            else{
                m1 = i+1;
                n1 = i+1;
            }
            curEnd = n1-m1+1;
            if(curEnd > maxSoFarEven){
                p1 = m1;
                q1 = n1;
                maxSoFarEven = q1-p1+1;
            }

        }
        if(maxSoFarEven > maxSoFarOdd)
            return s.substring(p1,q1+1);
        else
            return s.substring(p,q+1);
    }


    public static void main(String[] args){
        String s = "adam";
        System.out.println(longestPalindrome(s));


    }

    



}
