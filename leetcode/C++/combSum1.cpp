class Solution{
public:
    vector<vector<int> > combinationSum(vector<int> &candidates, int target) {
        vector<vector<int> > list;
        vector<int> ele;
        combHelper(0,0,target,candidates,ele,list);
        return list;

    }

    void combHelper(int index, int sum, int target,vector<int> candidates,vector<int> &ele,vector<vector<int> > &list){
        if(sum > target)
            return;
        if(sum == target){
            list.push_back(ele);
        }
            
        if(index > 0)
            index--;

        for(int i = index; i < candidates.size();++i){
            ele.push_back(candidates[i]);
            combHelper(index+1,sum+candidates[i],target,candidates,ele,list);
            ele.pop_back();
        }

    }
};
