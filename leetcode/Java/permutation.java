import java.util.*;
public class Solution{
    public ArrayList<ArrayList<Integer> > permuter(int[] num){
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
        permuterHelper(list,num,0,num.length-1);
        return list;
    }

    public void  permuteHelper(ArrayList<ArrayList<Integer> > list,int[] num,int start,int end){
        int n = num.length;
        for(int j = start; j < end;++j){
            swap(num,i,j);
            ArrayList<Integer> ele = new ArrayList<Integer>();
            ele.add(num[i]);
            ArrayList<ArrayList<Integer> > sublist = permuter(num,start+1,end);
            for(ArrayList<Integer> m : sublist){
                ele.clear();
                ele.add(num[i]);
                ele.add(m);
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
