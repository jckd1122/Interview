#include <iostream>
#include <string>
#include <sstream>
#include <vector>
using namespace std;


//having some boundy issue,need to fix it
class Solution{
public:
    string getPermutation1(int n,int k){
        vector<int> num;
        for(int i = 1; i <= n;++i){
            num.push_back(i);
        }
    
        int p = 0;
        int f = fact(n-1);
        k--;
        while(k > 0){
            int r = k/f;
            swap(num[p],num[p+r]);
            k =  k-r*f;
            num[p+r] = num[p+r-1];
            while(r > 1){
                ; 
                r--;
            }
            f = f/(n-1-p);
            p++;
        }

        stringstream s;
        for(int i = 0; i < n;++i){
            s << num[i];
        }
        return s.str();
    }

    string getPermutation2(int n, int k){
        string s;
        string head,tail;
        string c = "1";
        s.resize(n);
    
        for(int i = 0; i < n;++i)
            s[i] = '1'+i;
    

        int p = 0;
        int f = fact(n-1);
        k--;
        while(k > 0){
            int r = k/f;
            swap2(s[p],s[p+r]);
            k = k-r*f;
            head = s.substr(p+1,r-1);
            tail = (p+r+1 >= n)? "":s.substr(p+r+1);
            if(r <= 1)
                s = s.substr(0,p+1)+s.substr(p+1);
            else
                s = s.substr(0,p+1)+c+head+tail;
            f = f/(n-1-p);
            p++;
        }
    
        return s;
    }


    int fact(int n){
        int ret = 1;
        for(int i = 1; i <= n;++i){
            ret *= i;
        }
        return ret;
    }

    void swap1(int &i,int &j){
        int tmp = i;
        i = j;
        j = tmp;
    }

    void swap2(char &i,char &j){
        char tmp = i;
        i = j;
        j = tmp;
    }


};


int main(){
    Solution wenqiang;
    for(int i = 1; i <=6 ;++i)
        cout << wenqiang.getPermutation1(3,i) << endl;
}
