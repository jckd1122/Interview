import java.lang.Math;

public class grayCode{
    public static ArrayList<Integer> code(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        
        for(int i = 1; i <= n;++i){
            for(int j = 1; j <= list.size();++j){
                int num = list.get(list.size()-j);
                list.add(num+list.size());
            }
        }
        return list; 
    }


}
