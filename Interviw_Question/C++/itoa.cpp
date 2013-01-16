

#include <stdio.h>
#include <stdlib.h>
#include <math.h>


char* ia(int value,char* str){
    int base = 10;
    int l = 0;
    int start = 0;
    if(value < 0){
        start = 1;
        str[0] = '-';
        value = -value;
    }

    int val = value;
    while(val > 0){
        val /= base;
        l++;
    }

    
    int num = 0;
    for(int i = start; i < start+l;++i){
        num = value/pow(10,l+start-i-1);
        value -= num*pow(10,l+start-i-1);
        str[i] = num+'0';
    }

    return str;
}




int main ()
{
    int i;
    char buffer [33];
    printf ("Enter a number: ");
    scanf ("%d",&i);
    ia (i,buffer);
    printf ("decimal: %s\n",buffer);
    //ia (i,buffer,16);
    //printf ("hexadecimal: %s\n",buffer);
    //ia (i,buffer,2);
    //printf ("binary: %s\n",buffer);
    return 0;
}
