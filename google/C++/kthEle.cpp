#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <iostream>
using namespace std;

//find the kth smallest element in the unions of two sorted array
//repetitive numbers are still be considered as a independent number

int findKthHelper(int arr1[6], int arr2[6],int k){
    
    while(true){
        if(k == 1)
            return (arr1[k/2] < arr2[k/2])? arr1[k/2]:arr2[k/2];
        if(arr1[k/2-1] >= arr2[k/2-1]){
            if(arr1[k/2-1] <= arr2[k/2]){
                return arr1[k/2-1];
            }
            else{
                 return findKthHelper(arr1,arr2+k/2,k/2);   
            }
        }
        else{
            if(arr2[k/2-1] <= arr1[k/2]){
                return arr2[k/2-1];
            }
            else{
                return findKthHelper(arr1+k/2,arr2,k/2);
            }
        }
    
    }
}

int main(){
    int arr1[] = {6, 7, 8, 9, 12};
    int arr2[] = {1,100,100,100,100};
    cout << findKthHelper(arr1,arr2,2) << endl;

}
