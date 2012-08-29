public class Solution{

    public String countAndSay(int n){
        int[] buffer = new int[10];
        String cur = "";
        String prev = "1";
        for(int i = 2; i <= n;++i){
            int l = prev.length();
            int count = 0;
            int j = 0;
            int head = 0;
            while(j < l){
                if(prev.charAt(j) == prev.charAt(head)){
                    count++;
                }
                else{
                    head = j;
                    buffer[prev.charAt(j-1)+48] = count; 
                    count = 1;
                }
                
                j++;
            }
            buffer[prev.charAt(l-1)+48] = count;
            
           
            

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