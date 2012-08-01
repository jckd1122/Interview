

public class lastWord{

    public int lengthOfLastWord(String s){
        int n = s.length-1;
        for(int i = s; i>= 0;--i){
            if(s.charAt(i) == ' ')
                return n-i;
        }


    }



}
