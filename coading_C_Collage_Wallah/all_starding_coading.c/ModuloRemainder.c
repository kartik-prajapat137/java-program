#include<stdio.h>
int main(){
    int a,b;

    printf("Enter the value of a is:");
    scanf("%d",&a);
    printf("\n");

    printf("Enter the value of b is:");
    scanf("%d",&b);
    printf("\n");

    int c = a%b;

    printf("The value of remainder is:%d",c);

    return 0;
    
}