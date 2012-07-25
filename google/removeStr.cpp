#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <iostream>
using namespace std;

	
//?? still have issue
void swap(char* p, char* q){
	char tmp = *p;
	*p = *q;
	*q = tmp;
}


void remove(char* str1,char* str2){
	char* p = str1;
	char* q = str1;
	char* s = str2;
	
        
	do{
    	char* pos = p;
	    while(*p  == *s){
	    	p++;
        	s++;
			if(p-pos == 3){
				pos = p;
				s = str2;
			}
		}
       	if(p-pos < 3){
            p = pos;
		}
        
		s = str2;
        
    }while(*q++ = *p++);
	
}

int main(){
	char str1[] = "skjthshetheshetesm";
	char str2[] = "she";
	remove(str1,str2);
	printf("%s\n",str1);
	//cout << str1 << endl;

}

