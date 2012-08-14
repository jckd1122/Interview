public class Solution{
    public ArrayList<ArrayList<Integer> > permute(int[] num){
        int n = num.length;
        ArrayList<ArrayLIst<Integer> > baseList = new ArrayList<ArrayList<Integer> >();
        ArrayList<Integer> baseEle = new ArrayList<Integer>();
        if(n == 1){
            baseEle.add(num[0]);
            baseList.add(baseEle);
            return baseList;
        }

            
        int[] restNum = new int[n-1];
        for(int i = 0; i < n-1;++i)
            restNum[i] = num[i];

        ArrayList<ArrayList<Integer> > list = permute(restNum);
        for(int i = 0; i < list.size();++i){
            ArrayList<Integer> ele = list.get(i);
            for(int j = 0;j < ele.size();++j){
                ArrayList<Integer> newEle = ele;
                newEle.add(num[n-1],j);
                list.add(newEle);
            }
            ele.add(num[n-1]);

        }
        return list;

    }



}
