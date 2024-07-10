#include<stdio.h>
int main(){
    int n;
    printf("Enter the value of n is:");
    scanf("%d",&n);

    if(n<0){
        n=n*(-1);
       printf("The value of n is:%d",n);
    }else{
    printf("The value. of n is:%d",n);
    }
    return 0;
}