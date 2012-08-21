public class Solution{

    public String countAndSay(int n){
        int[] buffer = new int[10];
        String prev = "1";
        String newPrev = "";
        for(int i = 2; i <= n;++i){
            int l = prev.length();
            int count = 1;
            int j = 1;
            while(j++ < l){
                while(prev.charAt(j++) == prev.charAt(j++-1))
                    count++;
                buffer[prev.charAt(j-1)] = count;
                count = 1;
                
            }

            //generare newPrev
            j = 0;
            while(j < l){
                newPrev += (char)(buffer[prev.charAt(j)]+48); 
                newPrev += prev.charAt(j);
                j += buffer[prev.charAt(j)];

            }
            prev = newPrev;
        }
        return prev; 

    }


}