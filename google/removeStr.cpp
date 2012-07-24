#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <iostream>
using namespace std;

void swap(char* p, char* q){
	char tmp = *p;
	*p = *q;
	*q = tmp;
}


void remove(char* str1,char* str2){
	char* p = str1;
	char* q = str1;
	char* s = str2;
	char* sHead = str2;

	while(*p != '\0'){
		if(*p == *s){
			p++;
			s++;
			if(*s == '\0'){
				for(int i = 0;i < 6;){
					*q++ = *p++;
				}
				p = q;
				s = sHead;
			}
		}
		else{
			p++;
			q = p;
			s = sHead;
		}
	}
}

int main(){
	char str1[] = "sheabc ";
	char str2[] = "she";
	remove(str1,str2);
	printf("%s\n",str1);
	//cout << str1 << endl;

}

