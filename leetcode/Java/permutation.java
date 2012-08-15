import java.util.*;
public class Solution{
    public ArrayList<ArrayList<Integer> > permute(int[] num){
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
        permuteHelper(list,num,0,num.length-1);
        return list;
        
    }

    public void  permuteHelper(ArrayList<ArrayList<Integer> > list,int[] num,int start,int end){
        int n = num.length;
        if(start > end)
            return;
        for(int j = start; j <= end;++j){
            swap(num,start,j);
            ArrayList<Integer> ele = new ArrayList<Integer>();
            permuteHelper(list,num,start+1,end);
            ArrayList<ArrayList<Integer> > list1 = new ArrayList<ArrayList<Integer> >(list);
            ArrayList<ArrayList<Integer> > sublist = list1;
            list.clear();
            for(ArrayList<Integer> m : sublist){
                
                ele.clear();
                ele.add(num[start]);
                ele.addAll(m);
                list.add(ele);
            }
        }


    }

    void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }



}