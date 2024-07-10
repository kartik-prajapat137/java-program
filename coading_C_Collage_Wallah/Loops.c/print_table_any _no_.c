#include<stdio.h>
int main(){
int i,n;
    printf("Enter a no of table = ");
    scanf("%d",&n);

    for(i=1; i<=10; i=i+1){//for(i=n; i<=n*10; 1+n); //
        printf(" %d " ,i*n);//("%d ",i)
    }
    return 0;  //
    }