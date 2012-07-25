#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <cmath>

using namespace std;


//maximum A the procedure can generate
int procedure(int N){
    
    int maxOutput = 0;
    int output = 0;
    for(int k = 1; k <= N;++k){
        output = k;
        for(int i = N-k; i > 0; i = i-3){
            output *= 2;
            if(i < 3){
                output = output+i*output/2;
                break;
            }
                
        }

        if(output > maxOutput){
            maxOutput = output;
        }
    }
    return maxOutput;
}

int main(){
    cout << procedure(8) << endl;
}
