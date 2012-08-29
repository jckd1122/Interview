public class Solution{
    public String countAndSay(int n){
        int[] buffer = new int[10];
        String cur = "1";
        String prev = "1";
        for(int i = 2; i <= n;++i){
            //System.out.println(prev);
            cur = "";
            int l = prev.length();
            //System.out.println(l);
            int count = 0;
            int j = 0;
            int head = 0;
            while(j < l){
                if(prev.charAt(j) == prev.charAt(head)){
                    count++;
                }
                else{
                    cur += (char)(count+48); 
                    cur += prev.charAt(j-1);
                    head = j;
                    count = 1;
                }
                j++;
            }

            cur += (char)(count+48); 
            cur += prev.charAt(l-1);
            prev = cur;
        }
        return cur; 

    }
}
