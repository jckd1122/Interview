//need to determine the start index for different situations

public class Solution{
    public int lengthOfLongestSubstring1(String s){
        int[] arr = new int[256];
        for(int i = 0; i < 256;++i)
            arr[i] = -1;

        int l = s.length();
        int max = 0;
        int start = 0;
        for(int i = start; i < l;++i){
            char c = s.charAt(i);
            if(arr[c] == -1)
                arr[c] = i;
            else{
                start = (start > arr[c]+1)? start:arr[c]+1;
                arr[c] = i;
            }
            max = (max < i-start+1)? i-start+1:max;

        }
        return max;

    }

    public int lengthOfLongestSubstring2(String s){
        int[] arr = new int[256];
        for(int i = 0; i < 256;++i)
            arr[i] = -1;

        int l = s.length();
        int max = 0;
        int cur = 0;
        for(int i = 0; i < l;++i){
            char c = s.charAt(i);
            if(arr[c] == -1 || i-cur > arr[c])
                cur++;
            else{
                cur = i-arr[c];
            }
            arr[c] = i;
            max = (max < cur)? cur:max;

        }
        return max;

    }

}