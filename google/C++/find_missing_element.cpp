#include <iostream>
#include <cstdlib>
#include <vector>
using namespace std;

int main(){
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {1,3,4,5,6,8,9};
        vector<int> v1(arr1,arr1+9);
        vector<int> v2(arr2,arr2+7);
        int x = 0;

        for(int i = 0; i < v2.size();++i){
            x ^= v1[i];
            x ^= v2[i];
        }
        x ^= v1[v1.size()-2];
        x ^= v1[v1.size()-1];

        int k = x&(-x); //start from the first 1, the rest are all zeros
        int a = 0;
        int b = 0;
        for(int i = 0; i < v2.size();++i){
            if(v2[i]&k)
                a ^= v2[i];
            if(v1[i] & k)
                a ^= v1[i]; 
        }

        if(v1[v1.size()-2]&k)
            a ^= v1[v1.size()-2];
        if(v1[v1.size()-1]&k)
            a ^= v1[v1.size()-1];
        b = a^x;
        cout << a << endl;
        cout << b << endl;



}
