public class Solution{
    public boolean isInterleave(String s1,String s2,String s3){
        
        
        int[][] table = new int[s1.length()][s2.length()];
        return (helper(s1,s2,s3,table,0,0) == 1)? true:false;

    }

    int helper(String s1,String s2,String s3,int[][] table,int i,int j){
        if(i == s1.length()){
            if(s2.substring(j).equals(s3.substring(i+j)))
                return 1;
            else
                return -1;
        }
    
        if(j == s2.length()){
            if(s1.substring(i).equals(s3.substring(i+j)))
                return 1;
            else
                return -1;
        }

        if(table[i][j] != 0)
            return table[i][j];

        if(s1.charAt(i) != s2.charAt(j)){
            if(s3.charAt(i+j) == s1.charAt(i))
                table[i][j] = helper(s1.substring(i),s2,s3.substring(i+j),table,i+1,j);
            else if(s3.charAt(i+j) == s2.charAt(j))
                table[i][j] = helper(s1,s2.substring(j),s3.substring(i+j),i,j+1);
        }
        else{
            if(s3.charAt(i+j) == s1.charAt(i))
                table[i][j] = helper(s1.substring(i+1),s2,s3.substring(i+j),i+1,j) || isInterleave(s1,s2.substring(j+1),s3.substring(i+j),i,j+1);
            else
                table[i][j] = -1;
        }
        
        
    }

}
