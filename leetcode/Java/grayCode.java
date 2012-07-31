
import java.lang.Math;

public class grayCode{
    public static ArrayList<Integer> code(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for(int i = 2; i <= n;++i){
            int index = list.size()-1;
            for(int j = 1; j <= Math.pow(2.0,(double)i-1);++j){
                int num = list.get(index);
                list.add(num+Math.pow(2.0,(double)i-1));
                index--;
            }
        }
        return list;
    }


}
