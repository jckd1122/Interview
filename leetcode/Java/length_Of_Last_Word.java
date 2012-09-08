public class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        //if(l == 0)
        //    return 0;
        
        int tail = l-1;
        while(tail >= 0 && s.charAt(tail) == ' ')
            tail--;
        int head = tail;
        while(head >= 0 && s.charAt(head) != ' ')
            head--;
        return tail-head;
    }
}
