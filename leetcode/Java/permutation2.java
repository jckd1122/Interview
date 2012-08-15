import java.util.*;
import java.util.Arrays;
public class Solution{
    public ArrayList<ArrayList<Integer> > permute(int[] num){
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
        Arrays.sort(num);
        permuteHelper(list,num,0);
        return list;
        
    }

    public void  permuteHelper(ArrayList<ArrayList<Integer> > list,int[] num,int start){
        int n = num.length;
        if(start > n-1){    
            ArrayList<Integer> numList = new ArrayList<Integer>();
            for(int i = 0; i < n;++i)
                numList.add(num[i]);
            
            list.add(numList);
            return;
        }
        for(int j = start; j < n;++j){
            if(num[start] == num[j])
                continue;
            swap(num,start,j);
            permuteHelper(list,num,start+1);
            swap(num,start,j);
         
          
        }


    }

    void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }



}
