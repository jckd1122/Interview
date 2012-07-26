#include <cstdio>
#include <cstdlib>
#include <string>
#include <iostream>
#include <sstream>
using namespace std;
//solve

class solution{
public:
    int cal(string s){
        int v = 0;
        int l = s.length();
        int* arr = new int[20];
        
        arr[0] = 1;
        if(s[0] == '0' || s == "")
            return 0;
        

        for(int i = 1; i < l; ++i){
            istringstream is1(s.substr(0,i+1));
            is1 >> v;
            
            if(v >= 11 && v <= 26)
                arr[i] = 2;
            if(s[i] == '0' && s[i-1] == '0')
                arr[i] = 0;
            else if(s[i] == '0' && s[i-1] != '0' && s[i-1] <= '2')
                arr[i] = arr[i-2];
            else if (s[i] == '0' && s[i-1] >= '3')
                arr[i] = 0;
            else if(s[i] != '0' && s[i-1] == '0')
                arr[i] = arr[i-1];
            else if((s[i-1] >= '3' && s[i] != '0') || (s[i-1] == '2' && s[i] > '6'))
                arr[i] = arr[i-1];
            else
                arr[i] = arr[i-2]+arr[i-1];
        }

        
        return arr[l-1];
    }
};


int main(){
    solution sol;
    cout << sol.cal("112") << endl;

}
