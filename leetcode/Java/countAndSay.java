public class Solution{

    public String countAndSay(int n){
        int[] buffer = new int[10];
        String cur = "";
        String prev = "1";
        for(int i = 2; i <= n;++i){
            int l = prev.length();
            int count = 1;
            int j = 1;
            if(j == l)
                buffer[prev.charAt(j-1)+48] = 1;
            while(j< l){
                while(prev.charAt(j) == prev.charAt(j-1)){
                    count++;
                    j++;
                }
                buffer[prev.charAt(j-1)+48] = count;
                count = 1;
                ++j;
                
            }

            //generare newPrev
            j = 0;
            while(j < l){
                cur += (char)(buffer[prev.charAt(j)]+48); 
                cur += prev.charAt(j);
                j += buffer[prev.charAt(j)];

            }
            prev = cur;
        }
        return cur; 

    }


}