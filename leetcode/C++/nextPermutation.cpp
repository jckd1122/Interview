
class Solution{
Public:
    void nextPermutation(vector<int> &num){
        int n = num.size();
        int max = num[n-1];
        int min = num[n-1];
        for(int i = n-1; i >= 0;--i){
            if(num[i-1] >= max){
                max = num[i-1];
                continue;
            }
            else if(num[i-1] < min){
                swap(num,i-1,n-1);
                reverse(num,i,n-1);
                return;
            }
            else{
                for(int j = i; j < n-1;++j){
                    if(num[j] < min){
                        swap(num,i-1,j);
                        reverse(num,i,n-1);
                        return;
                    }
                }

            }
        }
        reverse(num,0,n-1);
        return;



    }

    void reverse(vector<int> &num,int i,int j){
        int l = (i-j+1)/2;
        for(k = i; k < i+l;++k)
            swap(num,k,2*l-k+1);
    }

    void swap(vector<int> &num,int i,int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

};
