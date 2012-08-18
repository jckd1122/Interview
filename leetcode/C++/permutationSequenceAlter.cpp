

class Solution{
public:
    string getPermutation(int n,int k){
        vector<int> num;
        for(int i = 1; i <= n;++i){
            num.push_back(i);
        }
    
        int pos = 0;
        int f = fact(n-1);
        while(k != 0){
            int r = k/f;
            swap(num[pos],num[pos+r]);
            k = k%r;
            while(r > 1){
                swap(num[pos+r],num[pos+r-1]);
                r--;
            }
            f = f/(n-1-pos);
            pos++;
        }

        stringstream s;
        for(int i = 0; i < n;++i){
            s << num[i];
        }
        return s.str();
    }

    int fact(int n){
        int ret = 1;
        for(int i = 1; i <= n;++i){
            ret *= i;
        }
        return ret;
    }

    void swap(int &i,int &j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

}
