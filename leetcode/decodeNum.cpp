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
        //istringstream is(s);
        int v = 0;
        int l = s.length();
        int* arr = new int[20];
        //is >> v;
        //cout << v << endl;
        
        arr[0] = 1;

        for(int i = 1; i < l; ++i){
            istringstream is(s.substr(0,i+1));
            is >> v;
            if(v == 10 || v == 20)
                arr[i] =  arr[i-1];
            else if(v >= 27 && v <=99 && v %10 == 0)
                arr[i] = 0;
            else if(v >= 27 && v <= 99 && v %10 != 0)
                arr[i] =  1;
            else if(v >= 11 && v <= 26)
                arr[i] = 2;
            else if(s[i] == 0)
                arr[i] = arr[i-2];
            else
                arr[i] = arr[i-2]+arr[i-1];
        }

        for(int i = 0; i < l;++i)
            cout << arr[i] << endl;
        cout << " " << endl;
        return arr[l-1];
    }
};


int main(){
 solution sol;
 cout << sol.cal("112") << endl;

}
