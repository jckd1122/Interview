public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        //boolean[] isUsed = new boolean[];
        int n = s1.length();
        if(n == 1)
            return s1.charAt(0) == s2.charAt(0);
        for(int i = 1; i < n;++i){
            if(isScramble(s1.sustring(0,i+1),s2.substring(0,i+1)))
                return true;
            if(isScramble(s1.sustring(0,i+1),s2.substring(n-i-1,n)))
                return true;
        
        }
        return false;
    }

    String swap(String s, int i , int j){
        char[] arr = s.toCharArray();
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return new String(arr);
    }
}
