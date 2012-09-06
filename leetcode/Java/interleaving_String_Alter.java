public class Solution{
    public boolean isInterleave(String s1,String s2,String s3){
        if(s1 == null || s2 == null || s3 == null)
            return false;

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if(l1+l2 != l3)
            return false;

        boolean[][] table = new boolean[l2+1];
        for(int i = 0; i < l2;++i)
            table[l2] = true;

        for(int i = l1; i >= 0;--i){
            for(int j = l2; j >= 0; --j){
                if(j < l2 && s2.charAt(j) == s3.charAt(i+j) && table[j+1])
                    table[i][j] = true;
                if(i < l1 && s1.charAt(i) == s3.charAt(i+j) && table[j])
                    table[i][j] = true;
            }
        }

        return table[0][0];


    }




}
