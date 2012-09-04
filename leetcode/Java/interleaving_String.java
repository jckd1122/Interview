public class Solution{
    public boolean isInterleave(String s1,String s2,String s3){
        if(s1.length() == 0){
            if(s2.equals(s3))
                return true;
            else
                return false;
        }
    
        if(s2.length() == 0){
            if(s1.equals(s3))
                return true;
            else
                return false;
        }
        
        if(s1.charAt(0) != s2.charAt(0)){
            if(s3.charAt(0) == s1.charAt(0))
                return isInterleave(s1.substring(1),s2,s3.substring(1));
            else if(s3.charAt(0) == s2.charAt(0))
                return isInterleave(s1,s2.substring(1),s3.substring(1));
        }
        else{
            if(s3.charAt(0) == s1.charAt(0))
                return isInterleave(s1.substring(1),s2,s3.substring(1)) || isInterleave(s1,s2.substring(1),s3.substring(1));
            return false;
        }
        
        
    }




}