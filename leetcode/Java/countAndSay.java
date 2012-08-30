//while looping, construct the result

public class Solution{
    public String countAndSay(int n){
        int[] buffer = new int[10];
        String cur = "1";
        String prev = "1";
        for(int i = 2; i <= n;++i){
            cur = "";
            int l = prev.length();
            int count = 0;
            int j = 0;
            int head = 0;
            while(j < l){
                if(prev.charAt(j) == prev.charAt(head)){
                    count++;
                }
                else{
                    cur = (char)(count+48)+prev.charAt(j-1);
                    head = j;
                    count = 1;
                }
                j++;
            }
            cur = (char)(count+48)+prev.charAt(l-1);
            prev = cur;
        }
        return cur; 

    }
}
