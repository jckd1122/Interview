public class Solution{

    public String countAndSay(int n){
        int[] buffer = new int[10];
        String prev = "1";
        String newPrev = "";
        for(int i = 2; i <= n;++i){
            int l = prev.length();
            int count = 1;
            for(int j = 1; j < l;++j){
                while(prev.charAt(j) == prevcharAt(j-1))
                    count++;
                buffer[prev.charAt(j-1)] = count;
                count = 1;
            }
            //generare newPrev
            int j = 0;
            while(j < l-1){
                newPrev += "48"+buffer[prev.charAt(j)]; 
                newPrev += prev.charAt(j);
                j += buffer[prev.charAt(j)];

            }
            prev = newPrev;
        }
        return prev; 

    }


}
