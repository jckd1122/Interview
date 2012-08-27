public class Solution{
    public int romanToInt(String s){
        int[] arr = new arr[256];
        arr[''] = Integer.MAX_VALUE;
        arr['M'] = 1000;
        arr['D'] = 500;
        arr['C'] = 100;
        arr['L'] = 50;
        arr['X'] = 10;
        arr['V'] = 5;
        arr['I'] = 1;
        
        int ret = 0;
        char prev = '';
        int n = s.length();
        if(n == 0)
            return 0;
        for(int i = 0; i < n;++i){
            char c = s.charAt(i);
            if(arr[c] > arr[prev]){
                ret += arr[c]-2*arr[prev];
            }
            else
                ret += arr[c];
            prev = c;
        }
        return ret;

        
    }


}