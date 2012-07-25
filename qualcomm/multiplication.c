#include <stdio.h>
#include <stdlib.h>

//short is actually 16 bits
int  mul(int a ,int b){
	int result = 0;
	if(b < 0)
		return mul(a,-b);
	else{
		int i;
		for(i = 0; i < 7;++i){
			if(b&1){
				result = result+a;
				//printf("haha");
				
				
			}
			a <<= 1;
			b >>= 1;
	
			
		}
	}
	return result;

}

int main(){
	int a = 3;
	int b = 4;
	printf("%d\n",mul(a,b));
}

