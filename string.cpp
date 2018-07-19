#include <iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
void swap(char *x,char *y)
{
    char temp=*x;
    *x=*y;
    *y=temp;
}

void permute(char* array, int l, int r)
{
    if(l==r)
    {
        printf("%s ",array);
    }
    else
    {
        for(int i=l;i<=r;i++)
        {
            swap((array+l),(array+i));
            permute(array,l+1,r);
            swap((array+l),(array+i));
        }
    }
}

int main() {
	//code
	int test=0;
	scanf("%d",&test);
	for(int i=0;i<test;i++)
	{
        char str[5];
        scanf("%s",str);
        
        int size=strlen(str);
        permute(str,0,size-1);
        printf("\n");
	}
	
	return 0;
}