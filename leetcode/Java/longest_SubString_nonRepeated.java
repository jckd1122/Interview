
public class Solution{
    public int lengthOfLongestSubstring(String s){
        int[] arr = new int[256];
        for(int i = 0; i < 256;++i)
            arr[i] = -1;

        int l = s.length();
        int start = 0;
        for(int i = start; i < l;++i){
            char c = s.charAt(i);
            if(arr[c] == -1)
                arr[c] = i;
            else{
                start = arr[c]+1;
            }

        }
        return l-start;

    }



}
