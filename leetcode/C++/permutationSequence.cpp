//better solution using swap, will update later

class Solution {
public:
    string getPermutation(int n, int k) {
        string num;
        stringstream s;
        for(int i = 1; i <= n;++i){
            s << i;
        }
        num = s.str();
        while(k-- > 1){
            nextPermutation(num);
        }
        
        return num;
    }
    
    
    void nextPermutation(string &num){
        int n = num.size();
        int max = num[n-1];
        int min = num[n-1];
        for(int i = n-1; i >= 0;--i){
            if(num[i-1] >= max){
                max = num[i-1];
                continue;
            }
           
            else{
                for(int j = i; j <= n-1;++j){
                    if(num[j] <= num[i-1]){
                        swap(num,i-1,j-1);
                        reverse(num,i,n-1);
                        return;
                    }
                }
                swap(num,i-1,n-1);
                reverse(num,i,n-1);
                return;

            }
        }
        reverse(num,0,n-1);
        
    }

    void reverse(string &num,int i,int j){
        int l = j-i+1;
        for(int p = i,q = j; p < i+l/2;++p,--q)
            swap(num,p,q);
    }

    void swap(string &num,int i,int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

};