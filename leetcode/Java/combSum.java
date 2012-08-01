
public class combSum{

    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,int target){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ele = new ArrayList<Integer>();

        
        int sum = 0;
        int i = 0;
        while(i < candiates.length){
            ele.add(candidates[i]);
            sum += candidates[i];
            if(sum > target){
                ele.remove(ele.size()-1);
                ++i;
                continue;
            }
            if(sum+candidates[i] > target){
                ++i;
                continue;
            }
            if(sum+candidates[i] == target){
                ele.add(candidates[i]);
                list.add(ele);
                ele.remove(ele.size()-1);
                ++i;
                break;
            }
            
        }



        



    }


}
