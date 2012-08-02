#include <algorithm>

class Solution{
public:
    vector<vector<int> > combinationSum(vector<int> &candidates, int target) {
        vector<vector<int> > list;
        vector<int> ele;
        sort(candidates.begin(),candidates.end());
        combHelper(0,0,target,candidates,ele,list);
        return list;

    }

    void combHelper(int pos, int sum, int target,vector<int> candidates,vector<int> &ele,vector<vector<int> > &list){
        if(sum > target)
            return;
        if(sum == target){
            list.push_back(ele);
        }
            
     

        for(int i = pos; i < candidates.size();++i){
            ele.push_back(candidates[i]);
            combHelper(i,sum+candidates[i],target,candidates,ele,list);
            ele.pop_back();
        }

    }
};