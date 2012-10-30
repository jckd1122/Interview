public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        
        for(int i = 1; i <= n;++i){
            int s = list.size();
            for(int j = list.size()-1; j >= 0;--j){
                list.add(list.get(j)+s);
            }
        }
        return list; 
    }

}