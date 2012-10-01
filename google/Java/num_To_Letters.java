
给一个 数字串，  比如  12259 , map到 char数组 或者 String.  1 -> a 2-> b,
...  12 -> l ... 26-> z.


12259 ->  lyi  :  abbei  :  lbei : abyi

输入一个数字串，判断是否能转换成 String,如果能，则打印所以有可能的string.

public class num_To_Letters{
    public static void print(String num,String ret,int start){
        if(start == num.length() || num == null){
            System.out.println(ret);
            return;
        }

        if(num.charAt(start)-'0' != 0){
            char c = (char)(num.charAt(start)+48);
            print(num,ret+c,start+1);
        }
        
        if(start+1 < num.length()){
            String s = num.substring(start,start+2);
            int i = Integer.valueOf(s).intValue();
            if(i <= 26 && s.charAt(0) != '0'){
                char c = (char)(i+96);
                print(num,ret+c,start+2);
            }
        }
    }

    public static void main(String[] args){
        print("12023456","",0);
    }



}
