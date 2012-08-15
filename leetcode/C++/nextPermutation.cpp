class Solution{
public:
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
                for(int j = i; j <= n-1;++j){
                    if(num[j] <= num[i-1]){
                        swap(num,i-1,j-1);
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
        int l = j-i+1;
        for(int p = i,q = j; p < i+l/2;++p,--q)
            swap(num,p,q);
    }

    void swap(vector<int> &num,int i,int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

};
