public class Solution{
    public boolean isInterleave(String s1,String s2,String s3){
        if(s1 == null || s2 == null || s3 == null)
            return false;

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if(l1+l2 != l3)
            return false;

        boolean[][] table = new boolean[l1+1][l2+1];
        

        for(int i = 0; i < l1+1;++i){
            for(int j = 0; j < l2+1; ++j){
                if(i > 0 && s1.charAt(i) == s3.charAt(i+j) && table[i-1][j])
                    table[i][j] = true;
                if(j > 0 && s2.charAt(j) == s3.charAt(i+j) && table[i][j-1])
                    table[i][j] = true;
            }
        }

        return table[l1-1][l2-1];


    }




}