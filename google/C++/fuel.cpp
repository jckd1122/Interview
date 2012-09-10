#include <cstdio>
#include <cstdlib>
#include <iostream>
using namespace std;

//find the start position so that the car can travel successfully
int findStation(int* dist, int* fuel){
	int size = sizeof(dist);
	//cout << size << endl;
	int cum = 0; 
	int index = 0;
	int min = 0;
	for(int i = 0; i < size;++i){
		cum += fuel[i]-dist[i];
		if(cum < min){
			min = cum;
			index++;
		}
	}
	return index;
}


int main(){
	int dist[6] = {10,10,10,10,10,10};
	int fuel[6] = {1,1,1,1,1,1};
	cout << findStation(dist,fuel) << endl;
}
