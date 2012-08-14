public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean[] isUsed = new boolean[];
        int n = s1.length();
        if(n == 1)
            return s1.charAt(0) == s2.charAt(0);
        for(int i = 0; i < n;++i){
            int j = i;
            for(; j < n;++j){
                if(s1.charAt(i) == s2.charAt(j)){
                    if(isUsed[j] == false)
                        s2 = swap(s2,i,j);
                    else
                        return false;
                    isUsed[j] = true;
                    break;
                }
            }
        }
        return true;
    }

    String swap(String s, int i , int j){
        char[] arr = s.toCharArray();
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return new String(arr);
    }
}
