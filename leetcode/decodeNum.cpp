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
        istringstream is(s);
        int v = 0;
        int l = s.length();
        int* arr = new int[l];
        is >> v;
        
        arr[0] = 1;
        if(l == 1)
            return arr[0];

        for(int i = 1; i < l; ++i){
            if(v == 10 || v == 20)
                arr[i] =  arr[i-1];
            if(v >= 27 && v <=99 && v %10 == 0)
                arr[i] = 0;
            if(v >= 27 && v <= 99 && v %10 != 0)
                arr[i] =  arr[i-1];
            if(v >= 11 && v <= 26)
                arr[i] = 2;
            else
                arr[i] = arr[i-2]+arr[i-1];
        }

        return arr[l-1];
    }
};


int main(){
 solution sol;
 cout << sol.cal("123") << endl;

}
