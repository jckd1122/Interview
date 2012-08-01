import java.lang.*;

public class lastWord{

    public int lengthOfLastWord(String s){
        int n = s.length()-1;
        int pos = 0;
        for(int i = s; i>= 0;--i){
            if(s.charAt(i) == ' '){
                pos = n-i;
                break;
            }
        }
        return pos;

    }



}
