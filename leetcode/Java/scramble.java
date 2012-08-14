import java.lang.String;
public class Solution {
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        int[] table1 = new int[n];
        int[] table2 = new int[n];
        int[] table3 = new int[n];
        int[] table4 = new int[n];
        //if(n == 1)
        //    return s1.charAt(0) == s2.charAt(0);
        return isScrambleHelper(s1,s2,table1,table2,table3,table4);
    }
    
    public boolean isScrambleiHelper(String s1, String s2,int[] table1,int[] table2,int[] table3,int[] table4) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = s1.length();
        if(n == 1)
            return s1.charAt(0) == s2.charAt(0);
        for(int i = 0; i < n-1;++i){
            if(table1[i] == 0)
                table1[i] = isScramble(s1.substring(0,i+1),s2.substring(0,i+1));
            if(table2[i] == 0)
                table2[i] = isScramble(s1.substring(i+1,n),s2.substring(i+1,n));
            if(table3[i] == 0)
                table3[i] = isScramble(s1.substring(0,i+1),s2.substring(n-i-1,n));
            if(table4[i] == 0)
                table4[i] = isScramble(s1.substring(i+1,n),s2.substring(0,n-i-1));
            
            if(table1[i] && table2[i])
                return true;
            if(table3[i] && table4[i])
                return true;
        
        }
        return false;
}
