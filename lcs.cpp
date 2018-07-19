#include <iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

int c[100][100];
int b[100][100];

void print(char *x, char* y, int m, int n)
{
	if(m==0 || n==0)
		return;
	if(b[m-1][n-1]==0)
	{
		print(x,y,m-1,n-1);
		printf("%c",x[m-1]);
	}
	else if(b[m-1][n-1]==1)
	{
		print(x,y,m-1,n);
	}
	else
	{
		print(x,y,m,n-1);
	}
}

void lcs(char* x, char* y, int m, int n)
{
	for(int i=0;i<=m;i++)
	{
		c[i][0]=0;
	}
	for(int j=1;j<=n;j++)
	{
		c[0][j]=0;
	}
	for(int i=1;i<=m;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(x[i-1]==y[j-1])
			{
				c[i][j]=c[i-1][j-1]+1;
				b[i-1][j-1]=0;
			}
			else if(c[i-1][j]>=c[i][j-1])
			{
				c[i][j]=c[i-1][j];
				b[i-1][j-1]=1;
			}
			else
			{
				c[i][j]=c[i][j-1];
				b[i-1][j-1]=2;
			}
		}
	}
	print(x,y,m,n);
}

int main() {
	// your code goes here
	char str1[100];
	char str2[100];
	
	scanf("%s",str1);
	scanf("%s",str2);
	
	int len1=strlen(str1);
	int len2=strlen(str2);
	
	//printf("%s\n%s",str1,str2);
	
	lcs(str1,str2,len1,len2);
	
	
	return 0;
}