public class Solution {
   public boolean isInterleave(String s1,String s2,String s3){
        if(s1 == null || s2 == null || s3 == null)
            return false;

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if(l1+l2 != l3)
            return false;
        if(l2 == 0)
            return s1.equals(s3);
        if(l1 == 0)
            return s2.equals(s3);

        boolean[] table = new boolean[l2+1];
        boolean[] dp = new boolean[l2+1];
        table[0] = true;
        

        for(int i = 0; i <= l1;++i){
            for(int j = 0; j <= l2; ++j){
                if(j > 0 && s2.charAt(j-1) == s3.charAt(i+j-1) && table[j-1])
                    table[j] = true;
                if(i > 0 && s1.charAt(i-1) == s3.charAt(i+j-1) && table[j])
                    table[j] = true;
                
            }
        }

        return table[l2];


    }
}