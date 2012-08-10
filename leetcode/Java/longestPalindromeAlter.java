import java.lang.String;
//need to update
public class longestPalindromeAlter{
    public static String longestPalindrome(String s){
        int n = s.length();
        int l,u;
        int p,q;

        for(int i = 0; i < n;++i){
        
            //if s[i] is in the middle
            
        
            if(s.charAt(i) != s.charAt(i+1)){
                l = i;
                u = i;
                while(l >= 1 && u <= n-1){
                    l--;
                    u++;
                    if(s.charAt(l) != s.charAt(u))
                        break;

                }
                if(q-p < u-l){
                    q = u;
                    p = l;
                }
            }



            //s[i] and s[i+1] is in the middle
            l = i;
            u = i+1;
            while(l >=1 && u <= n-1){
                l--;
                u++;
                if(s.charAt(l) != s.charAt(u))
                    break;
            }
            if(q-p < u-l){
                q = u;
                p = l;
            }

        }
        return s.substring(p,q+1);
    }

    


    public static void main(String[] args){
        String s = "abcba";
        System.out.println(longestPalindrome(s));


    }

    



}
