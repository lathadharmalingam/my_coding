#include<stdio.h>
int main()
{
    int i,j,n=5;
    for (i=0;i<n;i++)
    {
        for(j=0;j<4;j++)
        { if(i>1)
        continue;
            printf("hi\n");
        }
       
    }
    return 0;
}